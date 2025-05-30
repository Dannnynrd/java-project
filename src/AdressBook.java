import java.lang.reflect.Array;
import java.util.ArrayList; // Nötig für die ArrayList
import java.util.Locale;
import java.util.Scanner;   // Nötig für den Scanner


public class AdressBook {
    private ArrayList<Contact> contactArrayList;
    private Scanner consoleScanner;

    public AdressBook() {
        this.contactArrayList = new ArrayList<>();
        this.consoleScanner = new Scanner(System.in);

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

            String firstname = ""; // Platzhalter falls firstname geskippt wird und falls nicht wird firstname überschrieben und für Klasse Name ein Objekt erstellen
            String lastname = ""; // Same as firstname
            boolean skip;


            // set the firstname to user Input
            System.out.println("Tip: by Leaving an empty line and pressing enter you skip the following info ");
            System.out.println("Enter the first name (String): ");
            String tempInput = consoleScanner.nextLine(); //
            if (!tempInput.isEmpty()) {
                firstname = tempInput;
            } else {
                System.out.println("First name entry skipped");
            }


            // set the lastname to user Input
            System.out.println("Enter the last name (String): ");
            tempInput = consoleScanner.nextLine();
            if (tempInput.isEmpty()){
                lastname = tempInput;
            } else {
                System.out.println("Last name entry skipped");
            }

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

        if (contactArrayList.isEmpty()){
            System.out.println("Keine Kontakte im Adressbuch gefunden.");
            return;
        }

            for(int i = 0; i < contactArrayList.size();i++){
                System.out.println("Kontakt " + (i+1) +  ":");
                System.out.println(contactArrayList.get(i));
                System.out.println(); // new line for better readability
            }

        }


        //t.search(Danny)

        public void search(String s){
        boolean gefunden = false;
        String searchItem = s.toLowerCase();

        for (int i = 0; i < contactArrayList.size(); i++){
            Contact kontakt = contactArrayList.get(i);
            if (kontakt.toString().toLowerCase().contains(searchItem)) {
                System.out.println("Treffer bei Kontakt #" + (i + 1) + ":");
                System.out.println(contactArrayList.get(i).toString());
                gefunden = true;
            }
        }
        if (!gefunden){
            System.out.println("Kein Kontakt enthält:" +  s);
        }

    }
    }

