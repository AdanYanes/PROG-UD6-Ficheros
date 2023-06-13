package net.salesianos.act4.lib;

import java.io.Serializable;
import java.util.ArrayList;

public  class TableContainer implements Serializable{

    private  ArrayList<Table> tableArray = new ArrayList<>();
    
    public TableContainer(String color, int legs){
        this.tableArray.add(new Table(color, legs));
    }

    public void addTable(String color, int legs){
        tableArray.add(new Table(color, legs));
    }

    public ArrayList<Table> getTableContainer(){
        return tableArray;
    }

}
