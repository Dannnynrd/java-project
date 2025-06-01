package Adressbook;

public class Business extends Contact {
    private String businessName;
    
    public Business() {        
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return this.businessName;
    }
}
