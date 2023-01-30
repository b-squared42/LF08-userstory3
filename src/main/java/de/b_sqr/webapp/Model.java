/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.b_sqr.webapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author boll.benjamin
 */
public class Model {
    private List<Printer> printerList = new ArrayList();

    public void add(Printer p) {
        if (!printerList.contains(p))
            printerList.add(p);
    }
    public void get(int i) {
        printerList.get(i);
    }
    public void remove(Printer p) {
        printerList.remove(p);
    }
    public int size() {
        return printerList.size();
    }


    public List<Printer> getPrinterList() {
        return printerList;
    }







}
