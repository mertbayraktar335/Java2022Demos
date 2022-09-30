package oop1;

public class IndividualCustomer extends Customer {
    public IndividualCustomer() {
        
    }
    public IndividualCustomer(int id, String customerNumber, String phoneNumber, String firstName, String lastName) {
        super(id, customerNumber, phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
