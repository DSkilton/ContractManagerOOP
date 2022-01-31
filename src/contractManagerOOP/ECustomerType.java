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
public class ECustomerType {
    private CustomerType customerType;

    public enum CustomerType {
        BUSINESS, NONBUSINESS;
    }
    
    public static CustomerType lookup(String id) {
        try {
            return CustomerType.valueOf(id);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Must be business or nonbusiness: " + id);
        }
    }
    
    public void setCustomerType(CustomerType customerType){
        this.customerType = customerType;
    }
    
    public CustomerType getValue() {
        return customerType;
    }


}
