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
public interface CustomerInterface {

    //First and last name gets and sets
    public String getFirstName();

    public void setFirstName(String name);

    public String getLastName();

    public void setLastName(String lastName);

    //Package get and set
    public String getPackageType();

    public void setPackageType(String packageType);

    //Data bundle get and set
    public String getDataBundle();

    public void setDataBundle(String dataBundle);

    //Reference get and set
    public String getReference();

    public void setReference(String reference);

    //Contract length get and set
    public int getContractLength();

    public void setContractLength(int contractLengthMonths);

    //International calls get and set
    public boolean getInternationalCallsIncluded();

    public void setInternationalCallsIncluded(boolean internationalCallsIncluded);

}
