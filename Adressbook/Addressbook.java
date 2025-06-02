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
        String input;
        int x;

        String businessName = "";
        String firstName = "";
        String lastName = "";
        String city = "";
        String street = "";
        int houseNumber = 0;
        int postalCode = 0;

        System.out.println("\nWhat kind of contact do you want to add?\nPlease enter:\n1. For personal conatct.\n2. For business contact.\n");
        
        x = scanner.nextInt();
        scanner.nextLine();

        if (x == 1) {
            Person contact = new Person();
            System.out.println("\nAdding Contact...\nTo skip inputs leave empty for strings or put 0 for integers and press ENTER.");

            System.out.print("\nEnter the first name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                firstName = input;
            } else {
                System.out.println("First name skipped.");
            }

            System.out.print("\nEnter the last name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                lastName = input;
            } else {
                System.out.println("Last name skipped.");
            }
        
            contact.setName(new Name(firstName, lastName));

            System.out.print("\nEnter postal Code: ");
            x = scanner.nextInt();
            if (x != 0) {
                postalCode = x;
            } else {
                System.out.println("Postal Code skipped.");
            }
            scanner.nextLine();

            System.out.print("\nEnter the city: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                city = input;
            } else {
                System.out.println("City skipped.");
            }
        
            System.out.print("\nEnter the street: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                street = input;
            } else {
                System.out.println("Street skipped.");
            }

            System.out.print("\nEnter house number: ");
            x = scanner.nextInt();
            if (x != 0) {
                houseNumber = x;
            } else {
                System.out.println("House number skipped.");
            }
            scanner.nextLine();

            contact.setAddress(new Address(city, postalCode, street, houseNumber));

            list.add(contact);
        } else if (x == 2) {
            Business contact = new Business();
            System.out.println("\nAdding Contact...\nTo skip inputs leave empty for strings or put 0 for integers and press ENTER.");

            System.out.println("\nEnter business name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                businessName = input;
            } else {
                System.out.println("Business name skipped.");
            }

            contact.setBusinessName(businessName);

            System.out.print("\nEnter owner's first name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                firstName = input;
            } else {
                System.out.println("First name skipped.");
            }

            System.out.print("\nEnter owner's last name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                lastName = input;
            } else {
                System.out.println("Last name skipped.");
            }
        
            contact.setName(new Name(firstName, lastName));

            System.out.print("\nEnter postal Code: ");
            x = scanner.nextInt();
            if (x != 0) {
                postalCode = x;
            } else {
                System.out.println("Postal Code skipped.");
            }
            scanner.nextLine();

            System.out.print("\nEnter the city: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                city = input;
            } else {
                System.out.println("City skipped.");
            }
        
            System.out.print("\nEnter the street: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                street = input;
            } else {
                System.out.println("Street skipped.");
            }

            System.out.print("\nEnter house number: ");
            x = scanner.nextInt();
            if (x != 0) {
                houseNumber = x;
            } else {
                System.out.println("House number skipped.");
            }
            scanner.nextLine();

            contact.setAddress(new Address(city, postalCode, street, houseNumber));

            list.add(contact);
        } else {
            System.out.println("Wrong input. Cancelling action...");
            return;
        }
    }

    public void printContacts() {
        System.out.println("\nPrinting address book...");
        int i = 0;
        
        for (Contact c : list) {
            System.out.println("\nEntry " + i + ":");
            System.out.println(c.toString());
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
            System.out.println("\nRemoved entry " + x + " " + list.get(x).toString() + " " + "from address book.");
            list.remove(x);
        }
    }

    public void search(String s){
        boolean found = false;
        String searchItem = s.toLowerCase();

        System.out.println("\nSearching for '" + s + "'...");

        for (int i = 0; i < list.size(); i++){
            Contact contact = list.get(i);
            if (contact.toString().toLowerCase().contains(searchItem)) {
                System.out.println("\nResult at contact #" + (i + 1) + ":");
                System.out.println(list.get(i).toString());
                found = true;
            }
        }
        if (!found){
            System.out.println("\nNo results for search term: '" +  s + "'.");
        }
    }
}
