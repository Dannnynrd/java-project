package Addressbook;

/**
 * A simple class for addresses.
 */
public class Address {
    /**
     * The city of the address.
     */
    private String city;
    /**
     * The postal code (zip code) of the address. Only numerical codes (intergers).
     */
    private int postalCode;
    /**
     * The street of the address.
     */
    private String street;
    /**
     * The house number of the address. Only numerical (intergers), no additional
     * information.
     */
    private int houseNumber;

    /**
     * Contsructs a new address without parameters.
     */
    Address() {
    }

    /**
     * Constructs a new address with city, postal code, street and hosue numebr
     * given by the four parameters.
     * 
     * @param city        The city of the address.
     * @param postalCode  The postal code of the address. Only numerical codes
     *                    (intergers).
     * @param street      The street of the address.
     * @param houseNumber The house number of the address. Only numerical
     *                    (intergers), no additional information.
     */
    Address(String city, int postalCode, String street, int houseNumber) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    /**
     * Gets the city of the address.
     * 
     * @return Returns the city of the address.
     */
    String getCity() {
        return this.city;
    }

    /**
     * Gets the postal code of the address.
     * 
     * @return Returns the postal codenof the address.
     */
    int getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the street of the address.
     * 
     * @return Returns the street of the address.
     */
    String getStreet() {
        return this.street;
    }

    /**
     * Gets the house number of the address.
     * 
     * @return Returns the house number of the address.
     */
    int getHouseNumber() {
        return this.houseNumber;
    }

    /**
     * Sets the city of the address with the parameter given.
     * 
     * @param city The city to set.
     */
    void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the postal code of the address with the parameter given.
     * 
     * @param postalCode The postal code to set.
     */
    void setPostalCode(int areaCode) {
        this.postalCode = areaCode;
    }

    /**
     * Sets the street of the address with the parameter given.
     * 
     * @param street The street to set.
     */
    void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets the house number of the address with the parameter given.
     * 
     * @param houseNumber The house number to set.
     */
    void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Returns a readable display of the address.
     * 
     * @return Returns address' attributes as readable display.
     */
    public String toString() {
        return this.street + " " + this.houseNumber + ", " + this.postalCode + " " + this.city;
    }
}