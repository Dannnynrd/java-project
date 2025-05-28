package Adressbook;

public class Address {
    private String city;
    private int postalCode;
    private String street;
    private int houseNumber;

    public Address() {

    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public Address(String city, int postalCode, String street, int houseNumber) {
        this.city = city;
        this. postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return this.city;
    }
    public int getPostalCode() {
        return this.postalCode;
    }
    public String getStreet() {
        return this.street;
    }
    public int getHouseNumber() {
        return this.houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(int areaCode) {
        this.postalCode = areaCode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    public String toString() {
        return this.street + " " + this.houseNumber + ", " + this.postalCode + " " + this.city;
    }
}