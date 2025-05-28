package Contact;

public class Name {
    private String firstName;
    private String lastName;
    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName() {
        return this.firstName;
    }
    String getLastName() {
        return this.lastName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
