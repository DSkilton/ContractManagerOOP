/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MC03353
 */
public class ReadData {

    private LinkedList<String> eachLine;
    private String fileName = "archive.txt";
    private Path filePath = Paths.get(fileName);
    private Charset ascii = Charset.forName("US-ASCII");
    private BufferedReader br;

    public ReadData() throws FileNotFoundException {
        br = new BufferedReader(new FileReader(fileName));
    }
    
    public <T> List<T> getList(){
        return new ArrayList<T>();
    }

    public void checkFileExists(String fileName) throws IOException {
        File f = new File(fileName);

        if (!f.exists()) {
            f.createNewFile();
        } else {
            System.out.println("File already exists");
        }
    }

    public int countColumns() throws IOException {
        int columns = 0;
        String[] firstLine = br.readLine().split("\\t");
        columns = firstLine.length;

        return columns;
    }

    public LinkedList<String> loadFileIntoList() throws IOException {
        eachLine = new LinkedList<String>();

        try (BufferedReader brf = Files.newBufferedReader(filePath, ascii)){
            brf.lines().forEach(line -> {
                eachLine.add(line);
            });

//        parallelStream().filter(line -> {
//            return line;
//        }).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return eachLine;
    }

    FilenameFilter filter = (file, fileName) -> {
        return fileName.contains(".");
    };

    public static void checkDirectory() {
        String[] contents = new File(".").list(); //.list(filter)
        for (String file : contents) {
            System.out.println(file);
        }
    }

    public static void createDirectory() {
        new File("file Name").mkdir();
    }

    public static void checkForFile() {
        Path path = Paths.get("fileName.txt");
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());
    }

    public static void createFile() {
        File myFile = new File("Contract.txt");
    }

    public static void backUpFile() {
        Path source = Paths.get("File directory locaiton (dont forget double \\) ");
        Path destination = Paths.get("back up file directory");

        try {
            Files.copy(source, destination, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
