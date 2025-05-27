public class Address {
    private String city;
    private int postalCode;
    private String street;
    private int houseNumber;

    public Address(String city, int postalCode, String street, int houseNumber) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }
    public String getStreet() {
        return street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override // Um Sicherzustellen dass falls in der Oberklasse eine toString methode ist die nicht überschrieben wird.
    public String toString() {
        return city + " " + postalCode + " " + street + " " + houseNumber;
    }
}
