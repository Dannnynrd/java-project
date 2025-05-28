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
        String test;
        String firstName = "";
        String lastName = "";
        String city = "";
        String street = "";
        int houseNumber = 0;
        int postalCode = 0;

        System.out.print("\nEnter the first name (skip to skip): ");
        test = scanner.nextLine();
        if (!test.equalsIgnoreCase("skip")) {
            firstName = test;
        }
        System.out.print("Enter the last name (skip to skip): ");
        test = scanner.nextLine();
        if (!test.equalsIgnoreCase("skip")) {
            lastName = test;
        }

        contact.setName(new Name(firstName, lastName));

        System.out.print("Enter the city (skip to skip): ");
        test = scanner.nextLine();
        if (!test.equalsIgnoreCase("skip")) {
            city = test;
        }
        

        System.out.print("Enter postal Code (0 to skip): ");
        int x = scanner.nextInt();
        if (x != 0) {
            postalCode = x;
        } //number only no additional information
        scanner.nextLine();

        System.out.print("Enter the street (skip to skip): ");
        test = scanner.nextLine();
        if (!test.equalsIgnoreCase("skip")) {
            street = test;
        }

        System.out.print("Enter house number (0 to skip): ");
        int y = scanner.nextInt();
        if (y != 0) {
            houseNumber = y;
        } //number only no additional information
        scanner.nextLine();

        contact.setAddress(new Address(city, postalCode, street, houseNumber));
        list.add(contact);
    }

    public void printContacts() {
        System.out.println("\nPrinting address book...");
        int i = 0;
        
        for (Contact c : list) {
            System.out.println("\nEntry " + i + ":");
            if (c.getName().getFirstName() != "" && c.getName().getLastName() != "") {
                System.out.println("\t" + c.getName());
            } else if (c.getName().getFirstName() != "" && c.getName().getLastName() == "" ) {
                System.out.println("\t" + c.getName().getFirstName());
            } else if (c.getName().getFirstName() == "" && c.getName().getLastName() != "" ) {
                System.out.println("\t" + c.getName().getLastName());
            }
        
            if (c.getAddress().getCity() != "" && c.getAddress().getStreet() != "" && c.getAddress().getPostalCode() != 0 && c.getAddress().getHouseNumber() != 0) {
                System.out.println("\t" + c.getAddress());
            } else if (c.getAddress().getCity() != "" && c.getAddress().getStreet() != "" && c.getAddress().getPostalCode() != 0 && c.getAddress().getHouseNumber() == 0) {
                System.out.println("\t" + c.getAddress().getStreet() + ", " + c.getAddress().getPostalCode() + " " + c.getAddress().getCity());
            } else if (c.getAddress().getCity() != "" && c.getAddress().getStreet() != "" && c.getAddress().getPostalCode() == 0 && c.getAddress().getHouseNumber() != 0) {
                System.out.println("\t" + c.getAddress().getStreet() + " " + c.getAddress().getHouseNumber() + ", " + c.getAddress().getCity());
            }
            i += 1;
        }
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
