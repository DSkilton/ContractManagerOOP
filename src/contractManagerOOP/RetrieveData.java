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
                
        try (BufferedReader bReader = new BufferedReader(new FileReader(fileString))){
            bReader.lines().forEach(line -> {
                System.out.println(line);
            });
            
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileString + "'");
            
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileString + "'");
            
        }
    }

    public File getFile() {

        return fileName;
    }

}
