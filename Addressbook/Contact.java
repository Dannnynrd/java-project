package Addressbook;

/**
 * An abstract class for contacts with attribtes and methods that all contacts
 * should have using the Name and Address classes form the Addressbook package.
 */
public abstract class Contact {
    /**
     * The name of the contact. Containing first name (+middle name) and last name.
     */
    private Name name;
    /**
     * The address of the contact. Containing postal code, city, street and house
     * number.
     */
    private Address address;

    /**
     * Constructs a new contact without parameters.
     */
    Contact() {
    }

    /**
     * Gets the name of the contact.
     * 
     * @return Returns the name of the contact.
     */
    Name getName() {
        return this.name;
    }

    /**
     * Gets the address of the contact.
     * 
     * @return Returns the address of the contact.
     */
    Address getAddress() {
        return this.address;
    }

    /**
     * Sets the name of the contact with the given parameter.
     * 
     * @param name The name to set.
     */
    void setName(Name name) {
        this.name = name;
    }

    /**
     * Sets the address of the contact with the given parameter.
     * 
     * @param address The address to set.
     */
    void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Returns a readable display of the contact by adding non-empty attributes to a
     * formatted output string.
     * 
     * @param output The output String constructed out of all non-empty attributes.
     * @return Returns class' attributes as readable display.
     */
    public String toString() {
        String output = "\t";

        if (!getName().getFirstName().isEmpty()) {
            output += getName().getFirstName() + " ";
        }
        if (!getName().getLastName().isEmpty()) {
            output += getName().getLastName();
        }
        if (!getName().getFirstName().isEmpty() || !getName().getLastName().isEmpty()) {
            output += "\n\t";
        }
        if (!getAddress().getStreet().isEmpty()) {
            output += getAddress().getStreet() + " ";
        }
        if (getAddress().getHouseNumber() != 0) {
            output += getAddress().getHouseNumber();
        }
        if (!getAddress().getStreet().isEmpty() || getAddress().getHouseNumber() != 0) {
            output += ", ";
        }
        if (getAddress().getPostalCode() != 0) {
            output += getAddress().getPostalCode() + " ";
        }
        if (!getAddress().getCity().isEmpty()) {
            output += getAddress().getCity();
        }

        return output;
    }
}