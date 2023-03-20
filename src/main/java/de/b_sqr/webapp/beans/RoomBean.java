package de.b_sqr.webapp.beans;

import de.b_sqr.webapp.Model;
import de.b_sqr.webapp.Room;
import de.b_sqr.webapp.devices.Computer;
import de.b_sqr.webapp.devices.Device;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "roomBean")
@SessionScoped
public class RoomBean implements Serializable {
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------

  public RoomBean() {
  }

  //-------------------------------------------------------------------------
  //  Var(s), Get / Set
  //-------------------------------------------------------------------------
  private Model model = new Model();
  private Room room = new Room();

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public Model getModel() {
    return model;
  }

  public void resetRoom() {
    this.room = new Room();
  }

  //-------------------------------------------------------------------------
  //  Method(s)
  //-------------------------------------------------------------------------
  public void addRoom() {
    model.addRoom(room);
    resetRoom();
  }

  public void deleteRoom(Room r) {
    model.removeRoom(r);
  }

}
