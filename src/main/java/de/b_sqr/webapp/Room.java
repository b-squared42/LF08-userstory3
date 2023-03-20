package de.b_sqr.webapp;

import de.b_sqr.webapp.devices.Device;

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

  public Type[] getTypes() {
    return Type.values();
  }

  private static int anzahl = 0;

  private int id;
  private String bezeichnung;
  private Type typ;

  private List<Device> deviceList;

  public Room() {
    this.id = anzahl++;
    deviceList = new ArrayList<>();
  }

  public void addHardware(Device d) {
    if (Objects.isNull(d)) return;
    deviceList.add(d);
    d.setRaum(this);
  }

  public void removeHardware(Device d) {
    if (Objects.isNull(d)) return;
    deviceList.remove(d);
    d.setRaum(null);
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

  public List<Device> getDeviceList() {
    return deviceList;
  }

  public void setDeviceList(List<Device> deviceList) {
    this.deviceList = deviceList;
  }
}
