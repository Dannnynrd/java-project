package Contact;

public class Contact {
    Name name;
    Adress adress;
    public Contact() {
    }
    public String getName() {
        return this.name.toString();
    }
    public String getAdress() {
        return this.adress.toString();
    }
    public void setName(Name name) {
        this.name = name;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public String toString() {
        return this.name.toString() + "\n" + this.adress.toString();
    }
}