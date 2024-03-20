package NewBank;


public class Bank {
    
    private String name;
    private String address;
    private int nit;
    private StakeHolder[] Stakeholders;

    public Bank(String name, String address, int nit, int numHolders) {
        this.name = name;
        this.address = address;
        this.nit = nit;
        this.Stakeholders = new StakeHolder[numHolders];
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNit() {
        return nit;
    }

    public void setName(String name) {
        this.name = name;
    }
addStakeHolder
        calculateFunds()
                removeStakeHolder
viewStakeHolder
   
    
             
}
