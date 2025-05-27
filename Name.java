public class Name {
    String city;
    int areaCode;
    String street;
    String houseNumber;
    public String getCity() {
        return this.city;
    }
    public int getAreaCode() {
        return this.areaCode;
    }
    public String getStreet() {
        return this.street;
    }
    public String getHouseNumber() {
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
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String toString() {
        return this.areaCode + " " + this.city + ", " + this.street + " " + this.houseNumber;
    }
}