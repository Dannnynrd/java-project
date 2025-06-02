package Addressbook;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * A simple class for address books using the Name, Address, Contact, Person and Business classes from the Addressbook package. 
 */
public class Addressbook {
    /**
     * The list of contacts for the address book.
     */
    private ArrayList<Contact> list;
    /**
     * A scanner to read inputs from the keyboard.
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Construcs a new address book without parameters.
     */
    public Addressbook() {
        this.list = new ArrayList<>();
    }

    /**
     * Interactively (with scanner and terminal inputs) adds a new contact (either personal or business) to the list of contacts for the address book. Empty inputs will be skipped (Strings: empty line + ENTER; int: 0 +  ENTER).
     */
    public void addContact() {
        String input;// Used to temp save String inputs read by scanner.
        int x;// Used to temp save int inputs read by scanner.

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

        if (x == 1) {//If input was 1 a new personal contact is interactively contructed.
            Person contact = new Person();
            System.out.println("\nAdding Contact...\nTo skip inputs leave empty for strings or put 0 for integers and press ENTER.");

            System.out.print("\nEnter the first name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                firstName = input;
            } else {
                System.out.println("First name skipped.");
            }

            System.out.print("\nEnter the last name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                lastName = input;
            } else {
                System.out.println("Last name skipped.");
            }
        
            contact.setName(new Name(firstName, lastName));

            System.out.print("\nEnter postal Code: ");
            x = scanner.nextInt();
            if (x != 0) {//Checks wether input was skipped.
                postalCode = x;
            } else {
                System.out.println("Postal Code skipped.");
            }
            scanner.nextLine();//Empties leftover inpust.

            System.out.print("\nEnter the city: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                city = input;
            } else {
                System.out.println("City skipped.");
            }
        
            System.out.print("\nEnter the street: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                street = input;
            } else {
                System.out.println("Street skipped.");
            }

            System.out.print("\nEnter house number: ");
            x = scanner.nextInt();
            if (x != 0) {//Checks wether input was skipped.
                houseNumber = x;
            } else {
                System.out.println("House number skipped.");
            }
            scanner.nextLine();//Empties leftover input.

            contact.setAddress(new Address(city, postalCode, street, houseNumber));

            list.add(contact);
        } else if (x == 2) {//If input was 2 a new business contact is interactively contructed.
            Business contact = new Business();
            System.out.println("\nAdding Contact...\nTo skip inputs leave empty for strings or put 0 for integers and press ENTER.");

            System.out.println("\nEnter business name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                businessName = input;
            } else {
                System.out.println("Business name skipped.");
            }

            contact.setBusinessName(businessName);

            System.out.print("\nEnter owner's first name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                firstName = input;
            } else {
                System.out.println("First name skipped.");
            }

            System.out.print("\nEnter owner's last name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                lastName = input;
            } else {
                System.out.println("Last name skipped.");
            }
        
            contact.setName(new Name(firstName, lastName));

            System.out.print("\nEnter postal Code: ");//Only numerical (interger) postal codes.
            x = scanner.nextInt();
            if (x != 0) {//Checks wether input was skipped.
                postalCode = x;
            } else {
                System.out.println("Postal Code skipped.");
            }
            scanner.nextLine();//Empties leftover input.

            System.out.print("\nEnter the city: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                city = input;
            } else {
                System.out.println("City skipped.");
            }
        
            System.out.print("\nEnter the street: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {//Checks wether input was skipped.
                street = input;
            } else {
                System.out.println("Street skipped.");
            }

            System.out.print("\nEnter house number: ");//Only numerical (integer) house numbers, no additional information. 
            x = scanner.nextInt();
            if (x != 0) {//Checks wether input was skipped.
                houseNumber = x;
            } else {
                System.out.println("House number skipped.");
            }
            scanner.nextLine();//Empties leftover input.

            contact.setAddress(new Address(city, postalCode, street, houseNumber));

            list.add(contact);
        } else { //Output for wrong input (neitehr 1 or 2)
            System.out.println("Wrong input. Cancelling action...");
            return;
        }
    }

    /**
     * Prints the list of contacts for the address book in a readable display.
     */
    public void printContacts() {
        System.out.println("\nPrinting address book...");
        int i = 0;//Counts iterations.
        
        for (Contact c : list) {
            System.out.println("\nEntry " + i + ":");
            System.out.println(c.toString());
            i += 1;
        }
    }

    /**
     * Interactively (with reader and terminal inputs) deletes a contact form the list of contact for the address book. Input -1 to cancel.
     */
    public void deleteContact() {
        System.out.println("\nWhich contact do you want to delete? (-1 to cancel)");//-1 to cancel
        printContacts();
        int x = scanner.nextInt();

        if (x == -1) {//Checks wether Action is cancelled.
            System.out.println("\nAction cancelled.");
            return;
        } else if (x >= list.size() || x < -1) {//Checks wether input is in range of address book entries.
            System.out.println("\nError: Integer out of range of entries. Action cancelled.");
            return;
        } else {//Deletes entry.
            System.out.println("\nRemoved entry " + x + " " + list.get(x).toString() + " " + "from address book.");
            list.remove(x);
        }
    }

    /**
     * Searches through all contacts in contact list for address boook to test wether parameter s is part of contact.
     * @param s Search term for contact list of address book.
     */
    public void search(String s){
        boolean found = false;//Test variable
        String searchItem = s.toLowerCase();//Turns search term into lower case to easily compare with contacts

        System.out.println("\nSearching for '" + s + "'...");

        for (int i = 0; i < list.size(); i++){//Iterates over all contacts and prints them in readable display if any attributes contain search term
            Contact contact = list.get(i);
            if (contact.toString().toLowerCase().contains(searchItem)) {//Checks wether readable display of contact in lower case contains search term in lower case
                System.out.println("\nResult at contact #" + (i + 1) + ":");
                System.out.println(list.get(i).toString());
                found = true;
            }
        }
        if (!found){//Checks wether any result was found + gives output if false
            System.out.println("\nNo results for search term: '" +  s + "'.");
        }
    }
}
