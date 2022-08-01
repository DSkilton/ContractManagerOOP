/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contractManagerOOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MC03353
 */
public class WriteData {
    private String fileName = "contracts.txt";
//    private Path filePath = Paths.get(fileName);
    
    public String dataToWrite(){
        String dataToBeWritten = " ";
        return dataToBeWritten;
    }
    
    public void saveToTxtFile() throws IOException{       
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(dataToWrite());
        }
    }
}
