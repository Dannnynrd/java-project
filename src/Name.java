public class Name {
    private String firstName;
    private String lastName;
    public Name(){

    }
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    @Override // Um Sicherzustellen dass falls in der Oberklasse eine toString methode ist die nicht überschrieben wird.
    public String toString() {
        return firstName + " " + lastName;
    }


}
