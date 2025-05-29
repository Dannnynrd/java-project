import java.util.ArrayList; // Nötig für die ArrayList
import java.util.Scanner;   // Nötig für den Scanner


public class AdressBook extends Contact {
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
        Contact ContactTemp = new Contact();


        System.out.println("Enter the first name: ");
        String firstname;
        consoleScanner.nextLine();
        firstname = consoleScanner.nextLine();
        String lastname;
        consoleScanner.nextLine();
        lastname = consoleScanner.nextLine();





        }

    }
