import Adressbook.Addressbook;

public class Main {
    public static void main(String[] args) {
        Addressbook addressbook = new Addressbook();
        addressbook.addContact();
        addressbook.printContacts();
    }
}


/*
TODO:
- documentation (especially of special cases, e.g. street in one word, no middle names, hyphenated last names, etc)
- add Addressbook.search(String s)
- overhaul some of the text prompts, e.g. "enter areaCode"
- make sure that when adding contacts they can be partially incomplete
 */

