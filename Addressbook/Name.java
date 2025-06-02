package Addressbook;

/**
 * A simple class for names.
 */
public class Name {
    /**
     * The first name part of the name, if necessary including a middle name after
     * space.
     */
    private String firstName;
    /**
     * The last name part of the name.
     */
    private String lastName;

    /**
     * Constructs a new name without parameters.
     */
    Name() {
    }

    /**
     * Constructs a new name with first name (+ middle name) and a last name given
     * by the two parameters.
     * 
     * @param firstName First name part of the name, if necessary including a middle
     *                  name after space.
     * @param lastName  Last name part of the name.
     */
    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets the first name part of the name.
     * 
     * @return Returns the first name part of the name.
     */
    String getFirstName() {
        return this.firstName;
    }

    /**
     * Gets the last name part of the name.
     * 
     * @return Returns the last name part of the name.
     */
    String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the first name part with given parameter.
     * 
     * @param firstName The first name part of the name to set.
     */
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name part with given parameter.
     * 
     * @param lastName The last name part of the name to set.
     */
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns a readable display of the name.
     * 
     * @return Returns class' attributes as readable display.
     */
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
