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
public class BusinessCustomer implements CustomerInterface {
    private String businessName, firstName, lastName, packageType, dataBundle, reference;
    private int contractLengthMonths;
    private boolean internationalCallsIncluded;   
    
    public BusinessCustomer(){
        
    }
    
    public String getBusinessName(){
        return businessName;
    }
    
    public void setBusinessName(String businessName){
        this.businessName = businessName;
    }
    
   @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String name) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getPackageType() {
        return packageType;
    }

    @Override
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    @Override
    public String getDataBundle() {
        return dataBundle;
    }

    @Override
    public void setDataBundle(String dataBundle) {
        this.dataBundle = dataBundle;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public int getContractLength() {
        return contractLengthMonths;
    }

    @Override
    public void setContractLength(int contractLengthMonths) {
        this.contractLengthMonths = contractLengthMonths;
    }

    @Override
    public boolean getInternationalCallsIncluded() {
        return internationalCallsIncluded;
    }

    @Override
    public void setInternationalCallsIncluded(boolean internationalCallsIncluded) {
        this.internationalCallsIncluded = internationalCallsIncluded;
    }    
}
