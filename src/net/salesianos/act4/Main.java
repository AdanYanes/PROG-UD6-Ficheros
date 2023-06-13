package net.salesianos.act4;

import java.io.Console;
import java.io.IOException;

import net.salesianos.act4.lib.FileEditor;

public class Main {
    public static void main(String[] args) throws IOException {

        Console console = System.console();

        FileEditor objectEditor = new FileEditor();
        
        boolean isActive = true;
        int option;

        while(isActive){
            System.out.println("Que desea hacer?");
            System.out.println("1. Añadir mesa nueva");
            System.out.println("2. Mostrar las mesas guardadas");
            option = Integer.parseInt(console.readLine("\n"));

            if(option == 1){
                String color = console.readLine("Introduzca el color de la mesa\n");
                int legs = Integer.parseInt(console.readLine("Introduzca el numero de patas\n"));
                objectEditor.addTable(color, legs);
            }else if(option == 2){
                objectEditor.readTables();
            }else{
                System.out.println("El mensaje introducido no es correcto. Se cierra la aplicacion");
                isActive = false;
            }
        }

    }
}
