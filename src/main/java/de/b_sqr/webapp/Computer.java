package de.b_sqr.webapp;

import java.time.LocalDate;

public class Computer extends Device {
  private String cpu;
  private int arbeitsspeicher;
  private String betriebssystem;
  private String typ;
  private String grafikkarte;
  private int festplatte_ssd;
  private int festplatte_hdd;

  public Computer() {

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
    return "Computer{" +
      "cpu='" + cpu + '\'' +
      ", arbeitsspeicher=" + arbeitsspeicher +
      ", betriebssystem='" + betriebssystem + '\'' +
      ", typ='" + typ + '\'' +
      ", grafikkarte='" + grafikkarte + '\'' +
      ", festplatte_ssd=" + festplatte_ssd +
      ", festplatte_hdd=" + festplatte_hdd +
      ", id=" + id +
      ", seriennummer='" + seriennummer + '\'' +
      ", modell='" + modell + '\'' +
      ", hersteller='" + hersteller + '\'' +
      ", status=" + status +
      ", herstellergarantie=" + herstellergarantie +
      ", lieferdatum=" + lieferdatum +
      '}';
  }
}
