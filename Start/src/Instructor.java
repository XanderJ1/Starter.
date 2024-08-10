

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String last, String first, String office){
        lastName = last;
        firstName = first;
        officeNumber = office;
    }
    public Instructor(Instructor object){
        lastName = object.lastName;
        firstName = object.firstName;
        officeNumber = object.officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String toString(){
        return "Name: " + lastName +" "+ firstName
                +"\nOffice number: " + officeNumber;
    }
}
