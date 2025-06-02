package Adressbook;

public abstract class Contact {
    private Name name;
    private Address address;

    Contact() {
    }

    Name getName() {
        return this.name;
    }

    Address getAddress() {
        return this.address;
    }

    void setName(Name name) {
        this.name = name;
    }
    
    void setAddress(Address address) {
        this.address = address;
    }
    
    public String toString() {
        String output = "\t";

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