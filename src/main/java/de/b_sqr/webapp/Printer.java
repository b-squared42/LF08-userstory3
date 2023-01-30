package de.b_sqr.webapp;

import javax.swing.*;
import java.time.LocalDate;

public class Printer extends Device {

  public enum Technology {
    COLOR_INKJET("Farbtintenstrahldrucker"), INKJET("Tintenstrahldrucker"), COLOR_LASERBEAM("Farblaserdrucker"), LASERBEAM("Laserdrucker");

    private final String label;

    Technology(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
  }

  public enum Paperformat {
    A3("A3"), A4("A4");

    private final String label;

    Paperformat(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
  }

  private Technology technologie;
  private boolean farbdruckfunktion;
  private Paperformat papierformatmax;
  private int druckseitengesamt;
  private int restkapazitaet;
  private int kapazitaetbetriebsmittel;

  public Printer(int id) {
    this.id = id;
    this.status = Device.Status.OK;
    this.kapazitaetbetriebsmittel = 200;
    this.restkapazitaet = 200;
  }

  public Printer(int id, String seriennummer, String modell, String hersteller, Device.Status status, int herstellergarantie, LocalDate lieferdatum, Technology technologie, boolean farbdruckfunktion, Paperformat papierformatmax) {
    this(id);
    this.seriennummer = seriennummer;
    this.modell = modell;
    this.hersteller = hersteller;
    this.status = status;
    this.herstellergarantie = herstellergarantie;
    this.lieferdatum = lieferdatum;
    this.technologie = technologie;
    this.farbdruckfunktion = farbdruckfunktion;
    this.papierformatmax = papierformatmax;
  }

  public void wechsleBetriebsmittel(int kapazitaet) {
    if (kapazitaet <= 0) {
      JOptionPane.showMessageDialog(null, "Kapazität muss größer 0 sein!", "Fehler", JOptionPane.ERROR_MESSAGE);
      return;
    }
    restkapazitaet = kapazitaet;
    kapazitaetbetriebsmittel = kapazitaet;
  }


  public void drucken(int anzahlseiten) {
    if (anzahlseiten <= 0) {
      JOptionPane.showMessageDialog(null, "Sie müssen schon mindestens eine Seite drucken wollen.", "Warnung", JOptionPane.WARNING_MESSAGE);
      return;
    }
    int zuDruckendeSeiten = anzahlseiten;
    if (restkapazitaet < zuDruckendeSeiten) {
      zuDruckendeSeiten = restkapazitaet;
    }
    druckseitengesamt += zuDruckendeSeiten;
    restkapazitaet -= zuDruckendeSeiten;
    if (anzahlseiten == zuDruckendeSeiten) {
      JOptionPane.showMessageDialog(null, zuDruckendeSeiten + " Seiten erfolgreich gedruckt!", "Warnung", JOptionPane.WARNING_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, "Es konnten nur " + zuDruckendeSeiten + " Seiten gedruckt werden!\nBitte wechseln Sie das Betriebsmittel!", "Meldung", JOptionPane.PLAIN_MESSAGE);
    }
  }

  @Override
  public String toString() {
    return id + ";" + seriennummer + ";" + modell + ";" + hersteller + ";" + status + ";" + herstellergarantie + ";" + lieferdatum + ";" + technologie + ";" + farbdruckfunktion + papierformatmax + ";" + druckseitengesamt + ";" + restkapazitaet + ";" + kapazitaetbetriebsmittel;
  }

  public Technology getTechnologie() {
    return technologie;
  }

  public void setTechnologie(Technology technologie) {
    this.technologie = technologie;
  }

  public boolean isFarbdruckfunktion() {
    return farbdruckfunktion;
  }

  public void setFarbdruckfunktion(boolean farbdruckfunktion) {
    this.farbdruckfunktion = farbdruckfunktion;
  }

  public Paperformat getPapierformatmax() {
    return papierformatmax;
  }

  public void setPapierformatmax(Paperformat papierformatmax) {
    this.papierformatmax = papierformatmax;
  }

  public int getDruckseitengesamt() {
    return druckseitengesamt;
  }

  public void setDruckseitengesamt(int druckseitengesamt) {
    this.druckseitengesamt = druckseitengesamt;
  }

  public int getRestkapazitaet() {
    return restkapazitaet;
  }

  public void setRestkapazitaet(int restkapazitaet) {
    this.restkapazitaet = restkapazitaet;
  }

  public int getKapazitaetbetriebsmittel() {
    return kapazitaetbetriebsmittel;
  }

  public void setKapazitaetbetriebsmittel(int kapazitaetbetriebsmittel) {
    this.kapazitaetbetriebsmittel = kapazitaetbetriebsmittel;
  }



  public Technology[] getTechnologies() {
    return Technology.values();
  }

  public Paperformat[] getPaperformats() {
    return Paperformat.values();
  }

}
