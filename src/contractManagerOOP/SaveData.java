/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author MC03353
 */
public class SaveData {
    private String fileName = "archive.txt";
    private BufferedReader br;
    
    public SaveData() throws FileNotFoundException{
        br = new BufferedReader(new FileReader(fileName));
    }

    public void checkFile(String fileName) throws IOException {
        File f = new File(fileName);

        if (!f.exists()) {
            f.createNewFile();
        } else {
            System.out.println("File already exists");
        }
    }
    
    public void loadFileIntoList(){
        String currentLine;
        try {
            while((currentLine = br.readLine()) != null){
                String line[] = currentLine.split("\\t");
                System.out.println(line[0] + " " + line[1]);
            }
        } catch (IOException e ){
        
        }
        
        
    }

}
