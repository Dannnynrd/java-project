package Contact;

public class Address {
    private String city;
    private int areaCode;
    private String street;
    private int houseNumber;

    public Address(String city, int areaCode, String street, int houseNumber) {
        this.city = city;
        this. areaCode = areaCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return this.city;
    }
    public int getAreaCode() {
        return this.areaCode;
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
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    public String toString() {
        return this.areaCode + " " + this.city + ", " + this.street + " " + this.houseNumber;
    }
}