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
    private String customerType;
    
    public Contract(){
        System.out.println("Business or non-business customer?");
        customerType = SC.next().toUpperCase();
        
        if(customerType.equalsIgnoreCase(ECustomerType.CustomerType.BUSINESS.toString())){
            System.out.println("it worked");
            BusinessCustomer bCustomer = new BusinessCustomer();
        } else if(customerType.equalsIgnoreCase(ECustomerType.CustomerType.NONBUSINESS.toString())){
            System.out.println("it worked again");
            NonBusinessCustomer nonBCustomer = new NonBusinessCustomer();
        } else {
            System.out.println("Problem here with ENUMS");
        }
        
    }
    
    void newContract(){
        System.out.println("Name: ");
        System.out.println("Package: ");
        System.out.println("Data Bundle: ");
        System.out.println("Reference: ");
        System.out.println("Contract Length: ");
        System.out.println("International Class Included: ");
       
    }
    
    void summaryOfContracts(){
        
    }
    
    void summaryOfContractsSpecificMonth(){
        
    }
    
    void findContract(){
    
    }
    
    void displayContract(){
    
    }
    
}// end of class
