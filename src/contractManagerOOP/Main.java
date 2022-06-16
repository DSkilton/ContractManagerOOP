/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    protected static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example().setVisible(true);
            }
        });

//        Menu menuObject = new Menu(); //creates object called menu
//        
//        ReadData sd = new ReadData();
//        System.out.print(sd.loadFileIntoList() + "\n");
//        
//        WriteData wd = new WriteData();
//        wd.saveToTxtFile();

    }
}
