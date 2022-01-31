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
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author MC03353
 */
public class RetrieveData {

    String fileString = "Archive.txt";
    File fileName = new File(fileString);

    public RetrieveData() throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bReader = new BufferedReader(fileReader);
    }

    public String loadArchive() throws IOException {
        String line = "";
        try (BufferedReader in = new BufferedReader(new FileReader(fileString))) {
            System.out.println(fileString);
            while ((line = in.readLine()) != null) {
            }
            System.out.println(line);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return line;
    }

    public File getFile() {

        return fileName;
    }

}
