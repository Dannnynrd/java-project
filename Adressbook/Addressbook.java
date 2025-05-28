package Adressbook;
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
        Address address = new Address();
        Boolean hNTest = true;
        Boolean pCTest = true;
        int houseNumber = 0;
        int postalCode = 0;

        System.out.print("\nEnter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        contact.setName(new Name(firstName, lastName));

        System.out.print("Enter the city: ");
        String city = scanner.nextLine();
        address.setCity(city);

        System.out.print("Enter postal Code (0 to skip): ");
        int x = scanner.nextInt();
        if (x == 0) {
            pCTest = false;
            System.out.println("Skipped...\n");;
        } else {postalCode = x; address.setPostalCode(postalCode);} //number only no additional information
        scanner.nextLine();

        System.out.print("Enter the street: ");
        String street = scanner.nextLine();
        address.setStreet(street);

        System.out.print("Enter house number (0 to skip): ");
        int y = scanner.nextInt();
        if (y == 0) {
            hNTest = false;
            System.out.println("Skipped...");;
        } else {houseNumber = y; address.setHouseNumber(houseNumber);} //number only no additional information
        scanner.nextLine();

        if (hNTest && pCTest) {
            contact.setAddress(address);
        } else if (!hNTest && !pCTest) {
            contact.setAddress(new Address(city, street));
        }
        
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
