/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author MC03353
 */
public class WriteToAndCreateFile {

    FilenameFilter filter = (file, fileName) -> {
        return fileName.contains(".");
    };
    
    public static void checkDirectory(){
        String[] contents = new File(".").list(); //.list(filter)
        for (String file : contents){
            System.out.println(file);
        }
    }
    
    public static void createDirectory(){
        new File ("file Name").mkdir();
    }
    
    public static void checkForFile(){
        Path path = Paths.get("fileName.txt");
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());           
    }
    
    public static void createFile(){
        File myFile = new File("Contract.txt");
    }
    
    public static void backUpFile(){
        Path source = Paths.get("File directory locaiton (dont forget double \\) ");
        Path destination = Paths.get("back up file directory");
        
        try{
            Files.copy(source, destination, REPLACE_EXISTING);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
