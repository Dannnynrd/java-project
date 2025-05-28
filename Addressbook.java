import Contact.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Addressbook {
    private ArrayList<Contact> list;
    public Addressbook() {
        this.list = new ArrayList<>();
    }
    public void addContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first name: ");
        String firstName = scanner.next(); //no middle names
        System.out.print("Enter the last name: ");
        String lastName = scanner.next(); //only singular last names

        contact.setName(new Name(firstName, lastName));

        System.out.print("Enter the city: ");
        String city = scanner.next();
        System.out.print("Enter the areaCode: ");
        int areaCode = scanner.nextInt();
        System.out.print("Enter the street: ");
        String street = scanner.next();
        System.out.print("Enter the house number: ");
        int houseNumber = scanner.nextInt();

        contact.setAdress(new Address(city, areaCode, street, houseNumber));

        list.add(contact);
    }
    public void printContacts() {
        System.out.println("Printing address book...");
        int i = 0;
        for (Contact c : list) {
            System.out.print("\nEntry " + i + ":\n\t" + c.getName().toString() + "\n\t" + c.getAddress().toString());
            i += 1;
        }
    }
}
