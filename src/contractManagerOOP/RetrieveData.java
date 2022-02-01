/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MC03353
 */
public class RetrieveData {

    String fileString = "Archive.txt";
    File fileName = new File(fileString);
    private FileReader fileReader;
    private BufferedReader bReader;

    public RetrieveData() throws FileNotFoundException {

    }

    protected void loadArchive() throws IOException {
        int iLines = 0;
        
        try {
            fileReader = new FileReader(fileString);
            bReader = new BufferedReader(fileReader);
            while (bReader.readLine() != null) {
                iLines++;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileString + "'");
            
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileString + "'");
            
        } finally {
            bReader.close();
            fileReader.close();
        }
        System.out.println(iLines);
    }

    public File getFile() {

        return fileName;
    }

}
