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
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author MC03353
 */
public class RetrieveData {
    String fileString = "Archive.txt";
    Path fileName = Paths.get(fileString);
    Charset ascii = Charset.forName("US-ASCII");

    public RetrieveData() throws FileNotFoundException {

    }

    protected void loadArchive() throws IOException {
        
        try (BufferedReader bReader = Files.newBufferedReader(fileName,ascii)){
            bReader.lines().forEach(line -> {
                System.out.println(line);
            });
            
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileString + "'");
            
        } catch (IOException e) {
            System.out.println("Error reading file '" + fileString + "'");
            
        }
    }
}
