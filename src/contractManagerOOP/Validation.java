/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractManagerOOP;

import static contractManagerOOP.Main.SC;

/**
 *
 * @author MC03353
 */
public class Validation {

    private String input;

    public Boolean strValidation(String strToBeValidated) {
        System.out.print("Is this correct? " + strToBeValidated + " \n");
        input = SC.next();

        while ((!input.equalsIgnoreCase("yes")) && (!input.equalsIgnoreCase("no"))) {
            System.out.println("must be Yes or No");
            SC.next();
            break;
        }
 
        if(input.equalsIgnoreCase("no")){
            return false;
        }
        return true;
    }
}
