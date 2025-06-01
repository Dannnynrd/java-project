package Adressbook;

public abstract class Contact {
    private Name name;
    private Address address;

    public Contact() {
    }

    public Name getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
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