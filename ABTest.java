public class ABTest {
    public static void main(String[] args) {
        Addressbook addressbook = new Addressbook();
        addressbook.addContact();
        addressbook.printContacts();
        addressbook.addContact();
        addressbook.printContacts();
    }
}
