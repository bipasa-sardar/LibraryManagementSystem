package pkg_person;
import javax.naming.Name;
import java.util.regex.Pattern;
abstract public class person {//as we are not gonna create object of this class, we are making this abstract class
    protected String Name;
    protected String Email;
    protected String PhoneNo;
    protected String Address;
    protected String Dob;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        boolean isValidName = Pattern.matches("[a-zA-z]+", name);
        if (isValidName) {
            this.Name = name;
        }
        else {
            this.Name="default name";
        }
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
        boolean isValidDob=Pattern.matches("\\d{2}-\\d{2}-\\d{4}+",dob);
        if(isValidDob){
            this.Dob=dob;
        }

    }
    public person(String name, String email, String phoneNo, String address, String dob) {
        this.setName(name);//encapsulation
        Email = email;
        PhoneNo = phoneNo;
        Address = address;
        this.setDob(dob);
    }

    public person(){//default constructor
        super();
    }
}
