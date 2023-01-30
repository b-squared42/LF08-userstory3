/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.b_sqr.webapp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author boll.benjamin
 */
public class Model {
  private List<Printer> printerList = new ArrayList();
  private List<Computer> computerList = new ArrayList();

  public void addPrinter(Printer p) {
    if (!printerList.contains(p)) printerList.add(p);
  }

  public void addComputer(Computer c) {
    if (!computerList.contains(c)) computerList.add(c);
  }

  public Printer getPrinter(int i) {
    return printerList.get(i);
  }

  public Computer getComputer(int i) {
    return computerList.get(i);
  }

  public void removePrinter(Printer p) {
    printerList.remove(p);
  }

  public void removeComputer(Computer c) {
    computerList.remove(c);
  }

  public int sizeOfPrinter() {
    return printerList.size();
  }

  public int sizeOfComputer() {
    return computerList.size();
  }


  public List<Printer> getPrinterList() {
    return printerList;
  }

  public List<Computer> getComputerList() {
    return computerList;
  }


}
