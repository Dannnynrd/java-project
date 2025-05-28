package Adressbook;

public class Contact {
    private Name name;
    private Address address;

    public Contact() {
    }

    public Contact(Name name) {
        this.name = name;
    }

    public Contact(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Contact(String firstName, String lastName, String city, String street) {
        this.name.setFirstName(firstName);
        this.name.setLastName(lastName);
        this.address.setCity(city);
        this.address.setStreet(street);
    }

    public Contact(String firstName, String lastName, String city, String street, int postalCode) {
        this.name.setFirstName(firstName);
        this.name.setLastName(lastName);
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setPostalCode(postalCode);
    }

    public Contact(int houseNumber, String firstName, String lastName, String city, String street) {
        this.name.setFirstName(firstName);
        this.name.setLastName(lastName);
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setHouseNumber(houseNumber);
    }

public Contact(String firstName, String lastName, String city, String street, int postalCode, int houseNumber) {
    this.name.setFirstName(firstName);
    this.name.setLastName(lastName);
    this.address.setCity(city);
    this.address.setStreet(street);
    this.address.setPostalCode(postalCode);
    this.address.setHouseNumber(houseNumber);
}

    public String getName() {
        return this.name.toString();
    }
    public String getAddress() {
        return this.address.toString();
    }

    public void setName(Name name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String toString() {
        return this.name.toString() + "\n" + this.address.toString();
    }
}