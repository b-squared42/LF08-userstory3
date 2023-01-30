package de.b_sqr.webapp;

import java.time.LocalDate;

public class Computer extends Device {

  public enum Type {
    GAMING("Gaming-PC"), MEDIA("Multimedia-PC"), OFFICE("Office-PC");

    private final String label;

    Type(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
  }

  public Type[] getTypes() {
    return Type.values();
  }


  private String cpu;
  private int arbeitsspeicher;
  private String betriebssystem;
  private String typ;
  private String grafikkarte;
  private int festplatte_ssd;
  private int festplatte_hdd;

  public Computer(int id) {
    this.id = id;
    this.status = Device.Status.OK;

  }

  public Computer(String seriennummer, String modell, String hersteller, Device.Status status, int herstellergarantie, LocalDate lieferdatum, String cpu, int arbeitsspeicher, String betriebssystem, String typ, String grafikkarte, int festplatte_ssd, int festplatte_hdd) {
    this.seriennummer = seriennummer;
    this.modell = modell;
    this.hersteller = hersteller;
    this.status = status;
    this.herstellergarantie = herstellergarantie;
    this.lieferdatum = lieferdatum;
    this.cpu = cpu;
    this.arbeitsspeicher = arbeitsspeicher;
    this.betriebssystem = betriebssystem;
    this.typ = typ;
    this.grafikkarte = grafikkarte;
    this.festplatte_ssd = festplatte_ssd;
    this.festplatte_hdd = festplatte_hdd;
  }

  @Override
  public String toString() {
    return "Computer{" + "cpu='" + cpu + '\'' + ", arbeitsspeicher=" + arbeitsspeicher + ", betriebssystem='" + betriebssystem + '\'' + ", typ='" + typ + '\'' + ", grafikkarte='" + grafikkarte + '\'' + ", festplatte_ssd=" + festplatte_ssd + ", festplatte_hdd=" + festplatte_hdd + ", id=" + id + ", seriennummer='" + seriennummer + '\'' + ", modell='" + modell + '\'' + ", hersteller='" + hersteller + '\'' + ", status=" + status + ", herstellergarantie=" + herstellergarantie + ", lieferdatum=" + lieferdatum + '}';
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public int getArbeitsspeicher() {
    return arbeitsspeicher;
  }

  public void setArbeitsspeicher(int arbeitsspeicher) {
    this.arbeitsspeicher = arbeitsspeicher;
  }

  public String getBetriebssystem() {
    return betriebssystem;
  }

  public void setBetriebssystem(String betriebssystem) {
    this.betriebssystem = betriebssystem;
  }

  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }

  public String getGrafikkarte() {
    return grafikkarte;
  }

  public void setGrafikkarte(String grafikkarte) {
    this.grafikkarte = grafikkarte;
  }

  public int getFestplatte_ssd() {
    return festplatte_ssd;
  }

  public void setFestplatte_ssd(int festplatte_ssd) {
    this.festplatte_ssd = festplatte_ssd;
  }

  public int getFestplatte_hdd() {
    return festplatte_hdd;
  }

  public void setFestplatte_hdd(int festplatte_hdd) {
    this.festplatte_hdd = festplatte_hdd;
  }
}
