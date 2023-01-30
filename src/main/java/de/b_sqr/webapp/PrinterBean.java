package de.b_sqr.webapp;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
  private Printer printer = new Printer(model.size());

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
    this.printer = new Printer(model.size());
  }

  //-------------------------------------------------------------------------
  //  Method(s)
  //-------------------------------------------------------------------------
  public void addPrinter() {
//        if (this.printer.getFirstname() == null || this.person.getFirstname().isBlank())
//        {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fehler", "Vorname fehlt"));
//            return;
//        }

    model.add(printer);
    resetPrinter();
  }

  public void deletePrinter(Printer p) {
    model.remove(p);
  }

  public Device.Status[] getStatuses() {
    return Device.Status.getStatuses();
  }

}
