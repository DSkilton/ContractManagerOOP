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
public class NonBusinessCustomer implements CustomerInterface {
    private String firstName, lastName, packageType, dataBundle, reference;
    private int contractLengthMonths;
    private boolean internationalCallsIncluded;    
    
    //Constructor
    public NonBusinessCustomer() {
        
        setFirstName(SC.next());
        getLastName();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String name) {
        System.out.print("Enter your first name: ");
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
