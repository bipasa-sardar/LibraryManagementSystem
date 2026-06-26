package pkg_person;

public class Student extends person{
    private  int RollNo;
    private int Standard;
    private String Division;

    public Student(String name, String email, String phoneNo, String address, String dob, int rollNo, int standard, String division) {
        super(name, email, phoneNo, address, dob);
        RollNo = rollNo;
        Standard = standard;
        Division = division;
    }//parameterized constructor


    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public int getStandard() {
        return Standard;
    }

    public void setStandard(int standard) {
        Standard = standard;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Standard=" + Standard +
                ", Division='" + Division + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", Address='" + Address + '\'' +
                ", Dob='" + Dob + '\'' +
                '}';
    }
    public Student(){
        super();
    }//default constructor
}
