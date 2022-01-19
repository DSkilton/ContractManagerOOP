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
public class NonBusinessCustomer implements CustomerInterface {
    private String firstName, lastName, packageType, dataBundle, reference;
    private int contractLength;
    private boolean internationalCallsIncluded;    
    
    //Constructor
    public NonBusinessCustomer() {
        getFirstName();
        getLastName();
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public void setFirstName(String name) {

    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public String getPackageType() {
        return "";
    }

    @Override
    public void setPackageType(String packageType) {

    }

    @Override
    public String getDataBundle() {
        return "";
    }

    @Override
    public void setDataBundle(String dataBundle) {

    }

    @Override
    public String getReference() {
        return "";
    }

    @Override
    public void setReference(String reference) {

    }

    @Override
    public int getContractLength() {
        return -1;
    }

    @Override
    public void setContractLength(int contractLengthMonths) {

    }

    @Override
    public boolean getInternationalCallsIncluded() {
        return true;
    }

    @Override
    public void setInternationalCallsIncluded(boolean internationalCallsIncluded) {

    }

}
