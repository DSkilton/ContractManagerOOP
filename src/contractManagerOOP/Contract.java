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
public class Contract {

    private String scannerInput;

    public Contract() {
        System.out.println("Business or non-business customer?");
        scannerInput = SC.next().toUpperCase();

        //this if statement uses an ENUM to specify customer type
        if (scannerInput.equalsIgnoreCase(ECustomerType.CustomerType.BUSINESS.toString())) {
            BusinessCustomer customerTypeObj = new BusinessCustomer();
            System.out.print("Enter business name");    //input is stored in instance variable customerType
            customerTypeObj.setBusinessName(SC.nextLine());   //

        } else if (scannerInput.equalsIgnoreCase(ECustomerType.CustomerType.NONBUSINESS.toString())) {
            NonBusinessCustomer customerTypeObj = new NonBusinessCustomer();
            customerTypeObj.setFirstName(SC.nextLine());

        }

        newContract();
    }

    void newContract() {

    }

    void summaryOfContracts() {

    }

    void summaryOfContractsSpecificMonth() {

    }

    void findContract() {

    }

    void displayContract() {

    }

}// end of class
