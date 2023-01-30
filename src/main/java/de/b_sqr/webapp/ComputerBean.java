package de.b_sqr.webapp;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "computerBean")
@SessionScoped
public class ComputerBean implements Serializable {
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------

  public ComputerBean() {
  }

  //-------------------------------------------------------------------------
  //  Var(s), Get / Set
  //-------------------------------------------------------------------------
  private Model model = new Model();
  private Computer computer = new Computer(model.sizeOfComputer());

  public Computer getComputer() {
    return computer;
  }

  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  public Model getModel() {
    return model;
  }

  public void resetComputer() {
    this.computer = new Computer(model.sizeOfComputer());
  }

  //-------------------------------------------------------------------------
  //  Method(s)
  //-------------------------------------------------------------------------
  public void addComputer() {
    model.addComputer(computer);
    resetComputer();
  }

  public void deleteComputer(Computer c) {
    model.removeComputer(c);
  }

  public Device.Status[] getStatuses() {
    return Device.Status.getStatuses();
  }

}
