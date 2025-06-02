package Addressbook;

/**
 * A subclass for a business contact that extends the abstract class Contact.
 */
public class Business extends Contact {
    /**
     * The business name of the business.
     */
    private String businessName;

    /**
     * Contructs a new business without parameters.
     */
    Business() {
    }

    /**
     * Constructs a new business with a business name given by the parameter.
     * 
     * @param businessName The business name to set.
     */
    void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * Gets the business name of the business.
     * 
     * @return Returns the business name of the business.
     */
    String getBusinessName() {
        return this.businessName;
    }

    @Override
    /**
     * Overrides the toString() method of the abstract superclass contact to display
     * the business in a readable way by constructing a formatted output String with
     * the non-empty attributes.
     * 
     * @param output The output String build out of all non-empty attributes.
     * @return Returns the output String.
     */
    public String toString() {
        String output = "\t";

        if (!getBusinessName().isEmpty()) {
            output += getBusinessName() + "\n\t";
        }
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
