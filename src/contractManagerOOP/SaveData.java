/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author MC03353
 */
public class SaveData {
    private LinkedList<String> eachLine;
    private String fileName = "archive.txt";
    private BufferedReader br;
    
    public SaveData() throws FileNotFoundException{
        br = new BufferedReader(new FileReader(fileName));
    }

    public void checkFileExists(String fileName) throws IOException {
        File f = new File(fileName);

        if (!f.exists()) {
            f.createNewFile();
        } else {
            System.out.println("File already exists");
        }
    }
    
    public int countColumns() throws IOException{
        int columns = 0;
        
        String[] firstLine = br.readLine().split("\\t");
        columns = firstLine.length;
        
        System.out.println(columns);
        return columns;
    }
    
    public void loadFileIntoList(){
        eachLine = new LinkedList<String>(); 
        String currentLine;
        
        try {
            while((currentLine = br.readLine()) != null){
                String column[] = currentLine.split("\\t");
                eachLine.add(column[0] + " " + column[1] + " " + column[2] + " "
                + column[3]);
                
            }
        } catch (IOException e ){
            e.printStackTrace();
        }
        
        
    }

}
