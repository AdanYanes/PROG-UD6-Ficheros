package net.salesianos.act2;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String outputString = "";
        
        FileReader fileReader = new FileReader("src/net/salesianos/files/act2.txt");

        int counter = fileReader.read();

        while(counter != -1){
            outputString += (char)counter + "_" + counter + ",";
            counter = fileReader.read();
        }

        System.out.println(outputString);
    }
}
