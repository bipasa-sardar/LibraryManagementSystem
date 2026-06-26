package pkg_person;

abstract public class person {//as we are not gonna create object of this class, we are making this abstract class
    protected String Name;
    protected String Email;
    protected String PhoneNo;
    protected String Address;
    protected String Dob;

    public person(String name, String email, String phoneNo, String address, String dob) {
        Name = name;
        Email = email;
        PhoneNo = phoneNo;
        Address = address;
        Dob = dob;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public person(){//default constructor
        super();
    }
}
