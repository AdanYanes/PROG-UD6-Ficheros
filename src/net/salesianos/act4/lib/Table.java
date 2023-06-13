package net.salesianos.act4.lib;

import java.io.Serializable;

public class Table implements Serializable{
    private String color;
    private int legs;

    public Table(String color, int legs){
        this.color = color;
        this.legs = legs;
    }

    @Override
    public String toString(){
        return "Hay una mesa de color " + color + " y " + legs + " patas.";
    }
}
