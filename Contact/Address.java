package Contact;

public class Address {
    private String city;
    private int areaCode;
    private String street;
    private int houseNumber;
    Address(String city, int areaCode, String street, int houseNumber) {
        this.city = city;
        this. areaCode = areaCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    String getCity() {
        return this.city;
    }
    int getAreaCode() {
        return this.areaCode;
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
    void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    void setStreet(String street) {
        this.street = street;
    }
    void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String toString() {
        return this.areaCode + " " + this.city + ", " + this.street + " " + this.houseNumber;
    }
}