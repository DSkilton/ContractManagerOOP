/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contractManagerOOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author MC03353
 */
public class WriteData {
    private String fileName = "contracts.txt";
//    private Path filePath = Paths.get(fileName);
    
    public void saveToTxtFile() throws IOException{
        String example = "example";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write("string literal example \n");
            bw.write(example + "\n");
            bw.write("this current line");
            bw.newLine();
            bw.write("now we are on the new line \n");
            bw.write("cam");
        }
    }
}
