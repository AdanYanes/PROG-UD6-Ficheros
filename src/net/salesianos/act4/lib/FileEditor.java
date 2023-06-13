package net.salesianos.act4.lib;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileEditor  {

    
    public void addTable(String color, int legs) throws IOException {
        String filePath = "src/net/salesianos/files/act4.txt";
        FileInputStream inputFile = null;
        ObjectInputStream objectInput = null;
        FileOutputStream outputFile = null;
        ObjectOutputStream objectOutput = null;

        try {
            try {
                inputFile = new FileInputStream(filePath);
                objectInput = new ObjectInputStream(inputFile);

                TableContainer tableContainer = (TableContainer) objectInput.readObject();

                tableContainer.addTable(color, legs);

                outputFile = new FileOutputStream(filePath);
                objectOutput = new ObjectOutputStream(outputFile);
                objectOutput.writeObject(tableContainer);

            } catch (FileNotFoundException e) {
                TableContainer tableContainer = new TableContainer(color, legs);
                outputFile = new FileOutputStream(filePath);
                objectOutput = new ObjectOutputStream(outputFile);
                objectOutput.writeObject(tableContainer);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {                
            objectInput.close();
            objectOutput.close();
            inputFile.close();
            outputFile.close();
        }
    }
    
  


    public void readTables() throws IOException{

        String filePath = "src/net/salesianos/files/act4.txt";
        
        try {
            
            FileInputStream inputFile = new FileInputStream(filePath);
            ObjectInputStream objectInput = new ObjectInputStream(inputFile);

            TableContainer tableArray = (TableContainer) objectInput.readObject();

            while(true){
                System.out.println(tableArray.getTableContainer().toString());
                tableArray = (TableContainer) objectInput.readObject();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException ex) {
            System.out.println("Hemos llegado al final del fichero.");
        }
    }

}
