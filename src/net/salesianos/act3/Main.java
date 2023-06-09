package net.salesianos.act3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReaderAct1 = new FileReader("src/net/salesianos/files/act1.txt");
        
        FileReader fileReaderAct2 = new FileReader("src/net/salesianos/files/act2.txt");

        FileWriter fileWriter = new FileWriter("src/net/salesianos/files/act3.txt");

        String text = "";

        for (int i = 0; i < 2; i++) {
            text += "- Contenido del Fichero";
            text += (i == 0)? " UNO: " : " DOS: ";
            int readerCounter = ((i == 0)? fileReaderAct1 : fileReaderAct2).read();
            while(readerCounter != -1){
                text += (char)readerCounter;
                readerCounter = ((i == 0)? fileReaderAct1 : fileReaderAct2).read();
            }
            text += "\n";
        }

        System.out.println(text);

        fileWriter.write(text);

        fileReaderAct1.close();
        fileReaderAct2.close();
        fileWriter.close();

    }

}
