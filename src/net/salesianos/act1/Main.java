package net.salesianos.act1;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        Console console = System.console();
        
        FileWriter fileWriter = new FileWriter("src/net/salesianos/files/act1.txt");

        boolean isActive = true;

        String inputMsg = "";

        while(isActive){
            inputMsg = console.readLine("Por favor introduce una cadena de texto de 30 caracteres o mas\n").replaceAll(" ", "_").toUpperCase();

            if(inputMsg.length() < 30){
                System.out.println("Error. El texto tiene menos de 3o caracteres");
            }else{
                isActive = false;
            }
        }

        fileWriter.write(inputMsg);
        fileWriter.close();
    }
}