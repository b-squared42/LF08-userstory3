package de.b_sqr.webapp;

import java.time.LocalDate;

public abstract class Device {
  public enum Status {
    OK("OK"), REPAIR("Reparatur"), DEFECT("Defekt");

    private final String label;

    Status(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }

    public static Status[] getStatuses() {
      return Status.values();
    }
  }

  protected static int anzahl;
  protected int id;
  protected String seriennummer;
  protected String modell;
  protected String hersteller;
  protected Status status;
  protected int herstellergarantie;
  protected LocalDate lieferdatum;

  public abstract String toString();

  public LocalDate berechneGarantieende() {
    return lieferdatum.plusMonths(herstellergarantie);
  }

  public LocalDate getLieferdatum() {
    return lieferdatum;
  }

  public void setLieferdatum(LocalDate lieferdatum) {
    this.lieferdatum = lieferdatum;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSeriennummer() {
    return seriennummer;
  }

  public void setSeriennummer(String seriennummer) {
    this.seriennummer = seriennummer;
  }

  public String getModell() {
    return modell;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }

  public String getHersteller() {
    return hersteller;
  }

  public void setHersteller(String hersteller) {
    this.hersteller = hersteller;
  }

  public Device.Status getStatus() {
    return status;
  }

  public void setStatus(Device.Status status) {
    this.status = status;
  }

  public int getHerstellergarantie() {
    return herstellergarantie;
  }

  public void setHerstellergarantie(int herstellergarantie) {
    this.herstellergarantie = herstellergarantie;
  }
}
