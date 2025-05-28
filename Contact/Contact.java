package Contact;

public class Contact {
    private Name name;
    private Address address;
    Contact() {
    }
    String getName() {
        return this.name.toString();
    }
    String getAddress() {
        return this.address.toString();
    }
    void setName(Name name) {
        this.name = name;
    }
    void setAdress(Address address) {
        this.address = address;
    }
    public String toString() {
        return this.name.toString() + "\n" + this.address.toString();
    }
}