import java.util.ArrayList; // Nötig für die ArrayList
import java.util.Scanner;   // Nötig für den Scanner


public class AdressBook {
    private ArrayList<Contact> contactArrayList;
    private Scanner consoleScanner;

    public AdressBook() {
        this.contactArrayList = new ArrayList<>();
        this.consoleScanner = new Scanner(System.in); // Scanner initialisieren

    }

    public void deleteContact() {
        if (contactArrayList.isEmpty()) {
            System.out.println("Keine Kontakte zum Löschen vorhanden. Adressbuch ist schon Leer.");
            return;
        }

        System.out.println("Welchen Kontakt möchten Sie löschen?");
        System.out.println(contactArrayList);
        System.out.println("Bitte geben Sie die Nummer des zu löschenden Kontakts ein: ");

        int auswahlnummer;
        auswahlnummer = consoleScanner.nextInt();
        consoleScanner.nextLine();

        int indexZumLoeschen = auswahlnummer - 1;

        if (indexZumLoeschen >= 0 && indexZumLoeschen < this.contactArrayList.size()) {
        Contact geloeschterKontakt = this.contactArrayList.remove(indexZumLoeschen);
        } else {
            System.out.println();
        }

    }
        public void addContact () {

            String firstname;
            String lastname;


            // set the firstname to user Input
            System.out.println("Enter the first name: ");
            firstname = consoleScanner.nextLine();

            // set the lastname to user Input
            System.out.println("Enter the last name: ");
            lastname = consoleScanner.nextLine();

            // Create Object Name based on user Input
            Name nameTemp = new Name(firstname, lastname);

            String city;
            int zipcode;
            String street;
            int houseNumber;

            System.out.println("Enter a city: ");
            city = consoleScanner.nextLine();

            System.out.println("Enter a zipcode: ");
            zipcode = consoleScanner.nextInt();
            consoleScanner.nextLine();

            System.out.println("Enter a street: ");
            street = consoleScanner.nextLine();

            System.out.println("Enter the number of the house: ");
            houseNumber = consoleScanner.nextInt();
            consoleScanner.nextLine();

            Address adressTemp = new Address(city,zipcode,street,houseNumber);
            Contact newContact = new Contact(nameTemp,adressTemp);
            contactArrayList.add(newContact);

            System.out.println("Kontakt wurde hinzugefügt.");


        }

        public void printContacts(){
            System.out.println(contactArrayList);
        }

        public void search(String s){

        }
    }
