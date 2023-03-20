/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.b_sqr.webapp;

import de.b_sqr.webapp.devices.Computer;
import de.b_sqr.webapp.devices.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author boll.benjamin
 */
public class Model {
  private List<Printer> printerList = new ArrayList();
  private List<Computer> computerList = new ArrayList();
  private List<Room> roomList = new ArrayList();

  public void addPrinter(Printer p) {
    if (!printerList.contains(p)) printerList.add(p);
  }

  public void addComputer(Computer c) {
    if (!computerList.contains(c)) computerList.add(c);
  }

  public void addRoom(Room r) {
    if (!roomList.contains(r)) roomList.add(r);
  }

  public Printer getPrinter(int i) {
    return printerList.get(i);
  }

  public Computer getComputer(int i) {
    return computerList.get(i);
  }

  public Room getRoom(int i) {
    return roomList.get(i);
  }

  public void removePrinter(Printer p) {
    printerList.remove(p);
  }

  public void removeComputer(Computer c) {
    computerList.remove(c);
  }

  public void removeRoom(Room r) {
    roomList.remove(r);
  }


  public List<Printer> getPrinterList() {
    return printerList;
  }

  public List<Computer> getComputerList() {
    return computerList;
  }

  public List<Room> getRoomList() {
    return roomList;
  }


}
