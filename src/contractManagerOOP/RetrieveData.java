/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MC03353
 */
public class RetrieveData {

    private String fileString = "Archive.txt";
    private Path fileName = Paths.get(fileString);
    private Charset ascii = Charset.forName("US-ASCII");
    private Object actuallyT;
    List<String> list;

    public RetrieveData() {
        try {
            loadArchive();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    protected <T> List<T> loadArchive() throws IOException {
        try ( BufferedReader bReader = Files.newBufferedReader(fileName, ascii)) {
            bReader.lines().forEach(line -> {
                list.add(line);
            });

//        parallelStream().filter(line -> {
//            return line;
//        }).forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileString + "'");

        } catch (IOException e) {
            System.out.println("Error reading file '" + fileString + "'");
        }
        return (List<T>) list;
    }
}
