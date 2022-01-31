/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    protected static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
            //        Menu menu = new Menu(); //creates object called menu
            //        menu.menu();            //runs the menu method from the menu object

            RetrieveData rd = new RetrieveData();
            rd.loadArchive();
        

    }

}
