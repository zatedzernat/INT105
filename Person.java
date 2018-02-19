package javaapplication21.folder;

public class Person {
    private String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getSignature() {
        return name.substring(0, 2).toUpperCase()+name.substring(name.length()-2).toUpperCase();
    }
    
    @Override
    public String toString() {
        return "name=" + name + "\naddress=" + address + "\nphoneNumber=" + phoneNumber + "\nemailAddress=" + emailAddress;
    }
    
    
}
