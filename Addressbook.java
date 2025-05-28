import Contact.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Addressbook {
    private ArrayList<Contact> list;
    private static Scanner scanner = new Scanner(System.in);

    public Addressbook() {
        this.list = new ArrayList<>();
    }

    public void addContact() {
        Contact contact = new Contact();

        System.out.print("\nEnter the first name: ");
        String firstName = scanner.next(); //no middle names
        scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scanner.next(); //if double name then needs to be hyphonated
        scanner.nextLine();

        contact.setName(new Name(firstName, lastName));

        System.out.print("Enter the city: ");
        String city = scanner.next();
        scanner.nextLine();
        System.out.print("Enter the areaCode: ");
        int areaCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the street: ");
        String street = scanner.next();
        scanner.nextLine();
        System.out.print("Enter the house number: ");
        int houseNumber = scanner.nextInt(); //number only no additional information
        scanner.nextLine();

        contact.setAdress(new Address(city, areaCode, street, houseNumber));

        list.add(contact);
    }

    public void printContacts() {
        System.out.println("\nPrinting address book...");
        int i = 0;
        
        for (Contact c : list) {
            System.out.print("\nEntry " + i + ":\n\t" + c.getName().toString() + "\n\t" + c.getAddress().toString());
            i += 1;
        }

        System.out.println("\n");
    }

    public void deleteContact() {
        System.out.println("\nWhich contact do you want to delete? (-1 to cancel)");
        printContacts();
        int x = scanner.nextInt();

        if (x == -1) {
            System.out.println("\nAction cancelled.");
            return;
        } else if (x >= list.size() || x < -1) {
            System.out.println("\nError: Integer out of range of entries. Action cancelled.");
            return;
        } else {
            System.out.println("\nRemoved entry " + x + " " + list.get(x).getName() + " " + "from address book.");
            list.remove(x);
        }
    }
    // TODO: add Addressbook.search(String s)
}
