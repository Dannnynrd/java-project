package Adressbook;

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
     * The house number of the address. Only numerical (intergers), no additional information.
     */
    private int houseNumber;

    /**
     * Contsructs a new Address without parameters.
     */
    Address() {
    }
    /**
     * Constructs a new Address with city, postal code, street and hosue numebr given by the four parameters.
     * @param city The address' city.
     * @param postalCode The address' postal code. Only numerical codes (intergers).
     * @param street The address' street.
     * @param houseNumber The address' house number. Only numerical (intergers), no additional information.
     */
    Address(String city, int postalCode, String street, int houseNumber) {
        this.city = city;
        this. postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    String getCity() {
        return this.city;
    }
    int getPostalCode() {
        return this.postalCode;
    }
    String getStreet() {
        return this.street;
    }
    int getHouseNumber() {
        return this.houseNumber;
    }

    void setCity(String city) {
        this.city = city;
    }
    void setPostalCode(int areaCode) {
        this.postalCode = areaCode;
    }
    void setStreet(String street) {
        this.street = street;
    }
    void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    public String toString() {
        return this.street + " " + this.houseNumber + ", " + this.postalCode + " " + this.city;
    }
}