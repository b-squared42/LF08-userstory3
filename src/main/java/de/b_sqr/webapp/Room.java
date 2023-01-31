package de.b_sqr.webapp;

import de.b_sqr.webapp.devices.Computer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Room {

  public enum Type {
    CLASSROOM("Klassenraum"), IT("IT Fachraum"), ET("ET Fachraum"), CH("CH Labor"), SERVICE("Serviceraum"), TEACHER("Lehrkraftvorbereitungsraum"), OFFICE("Büro"), MISC("Sonstiges");

    private final String label;

    Type(String label) {
      this.label = label;
    }

    public String getLabel() {
      return label;
    }
  }

  private static int anzahl = 0;

  private int id;
  private String bezeichnung;
  private Type typ;

  private List<Computer> computerList;

  public Room() {
    this.id = anzahl++;
    computerList = new ArrayList<>();
  }

  public void addHardware(Computer c) {
    if (Objects.isNull(c)) return;
    computerList.add(c);
    c.setRaum(this);
  }
  public void removeHardware(Computer c) {
    if (Objects.isNull(c)) return;
    computerList.remove(c);
    c.setRaum(null);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public Type getTyp() {
    return typ;
  }

  public void setTyp(Type typ) {
    this.typ = typ;
  }

  public List<Computer> getComputerList() {
    return computerList;
  }

  public void setComputerList(List<Computer> computerList) {
    this.computerList = computerList;
  }
}
