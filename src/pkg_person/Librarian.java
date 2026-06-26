package pkg_person;

public class Librarian extends person{
    private int Id;
    private int DateOfJoin;



    public Librarian(int id, int DateOfJoin,String Name,String Email,String PhoneNo,String Address,String Dob) {
        super(Name,Email,PhoneNo,Address,Dob);
        this.Id = id;
        this.DateOfJoin=DateOfJoin;
    }//parameterized constructor which inherits super class variables

    public Librarian(){

    }//default constructor



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDateOfJoin() {
        return DateOfJoin;
    }

    public void setDateOfJoin(int dateOfJoin) {
        DateOfJoin = dateOfJoin;
    }


    @Override
    public String toString() {
        return "Librarian{" +
                "Id=" + Id +
                ", DateOfJoin=" + DateOfJoin +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", Address='" + Address + '\'' +
                ", Dob='" + Dob + '\'' +
                '}';
    }
}
