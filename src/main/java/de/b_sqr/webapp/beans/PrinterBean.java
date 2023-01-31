package de.b_sqr.webapp.beans;

import de.b_sqr.webapp.devices.Device;
import de.b_sqr.webapp.Model;
import de.b_sqr.webapp.devices.Printer;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "printerBean")
@SessionScoped
public class PrinterBean implements Serializable {
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------

  public PrinterBean() {
  }

  //-------------------------------------------------------------------------
  //  Var(s), Get / Set
  //-------------------------------------------------------------------------
  private Model model = new Model();
  private Printer printer = new Printer();

  public Printer getPrinter() {
    return printer;
  }

  public void setPrinter(Printer printer) {
    this.printer = printer;
  }

  public Model getModel() {
    return model;
  }

  public void resetPrinter() {
    this.printer = new Printer();
  }

  //-------------------------------------------------------------------------
  //  Method(s)
  //-------------------------------------------------------------------------
  public void addPrinter() {
    model.addPrinter(printer);
    resetPrinter();
  }

  public void deletePrinter(Printer p) {
    model.removePrinter(p);
  }

  public Device.Status[] getStatuses() {
    return Device.Status.getStatuses();
  }
}
