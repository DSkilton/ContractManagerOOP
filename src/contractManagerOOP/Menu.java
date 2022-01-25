/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

/**
 *
 * @author MC03353
 */
public class Menu {

    public void menu() {
        int input = -1;
        do {
            System.out.println("Please select an option below\n" + "1. Enter new contract\n" + "2. Display summary of contracts\n" + "3. Display summary of contracts for selected month\n" + "4. Find and display contract \n" + "0. Exit");
            while (!Main.SC.hasNextInt()) {
                System.out.println("must be an integer");
                Main.SC.next(); // advances Scanner to next line to avoid infinite loop
            }
            input = Main.SC.nextInt();
            menuOptions(input);
            Main.SC.next();
        } while (input != 0);
        System.exit(0);
    } //end of menu method

    public void menuOptions(int input) {
        Contract contractObj = new Contract();
        if (input == 1) {
            contractObj.newContract();
        } else if (input == 2) {
            contractObj.summaryOfContracts();
        } else if (input == 3) {
            contractObj.summaryOfContractsSpecificMonth();
        } else if (input == 4) {
            contractObj.findContract();
            contractObj.displayContract();
        } else {
            System.out.println("Must be a number show on the menu");
        } // end of if statement
    } // end of menuOptions
    
}
