import Addressbook.Addressbook;

public class Main {
    public static void main(String[] args) {
        Addressbook addressbook = new Addressbook();
        addressbook.addContact();
        addressbook.printContacts();
        addressbook.search("Kiel");
        addressbook.deleteContact();
    }
}
