package oop1;

public class Customer {
    private int id;
    private String customerNumber;
    private String phoneNumber;

    public Customer(int id, String customerNumber, String phoneNumber) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer Number :" +customerNumber + " "+"Id : "  +  id + " "+"Phone Number :" + phoneNumber + " ";
    }
    

}
