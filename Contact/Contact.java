package Contact;

public class Contact {
    private Name name;
    private Address address;
    public Contact() {
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
    public void setAdress(Address address) {
        this.address = address;
    }
    public String toString() {
        return this.name.toString() + "\n" + this.address.toString();
    }
}