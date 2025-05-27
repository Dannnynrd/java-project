public class Contact {
    private Name name;
    private Address address;

    public Contact() {
        // Falls Eingabe Leer
    }

    public Contact(Name name) {
        this.name = name; // Bei einer Eingabe
    }



    public Contact(Name name, Address address){
        this.name = name;
        this.address = address;
    }
    public Name getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public void setName(Name name){
        this.name = name;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public String toString() {
        return name.toString() + " " + address.toString();
    }
}
