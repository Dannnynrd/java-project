package Adressbook;

public class Business extends Contact {
    private String businessName;
    
    Business() {        
    }

    void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    String getBusinessName() {
        return this.businessName;
    }

    @Override
    public String toString() {
        String output = "\t";

        if (!getBusinessName().isEmpty()) {
            output += getBusinessName() + "\n\t";}
        if (!getName().getFirstName().isEmpty()) {
            output += getName().getFirstName() + " ";}
        if (!getName().getLastName().isEmpty()) {
            output += getName().getLastName();}
        if (!getName().getFirstName().isEmpty() || !getName().getLastName().isEmpty()) {
            output += "\n\t";}
        if (!getAddress().getStreet().isEmpty()) {
            output += getAddress().getStreet() + " ";}
        if (getAddress().getHouseNumber() != 0) {
            output += getAddress().getHouseNumber();}
        if (!getAddress().getStreet().isEmpty() || getAddress().getHouseNumber() != 0) {
            output += ", ";}
        if (getAddress().getPostalCode() != 0) {
            output += getAddress().getPostalCode() + " ";}
        if (!getAddress().getCity().isEmpty()) {
            output += getAddress().getCity();}

        return output;
    }
}
