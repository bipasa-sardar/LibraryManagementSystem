package pkg_main;

import pkg_book.BookManager;
import pkg_exception.StudentNotFoundException;
import pkg_person.Student;
import pkg_person.StudentManager;
import pkg_transaction.BookTransactionManager;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException, IOException {
        int choice;
        Scanner sc = new Scanner(System.in);
        BookManager bm = new BookManager();
        StudentManager sm = new StudentManager();
        BookTransactionManager btm = new BookTransactionManager();

        do{
            System.out.println("enter 1 if student \n enter 2 if librarian \n enter 3 to exit");
            choice = sc.nextInt();
            if(choice==1){
                System.out.println("enter your roll  number :");
                int rollno=sc.nextInt();
                try{
                    Student s = sm.get(rollno);
                    if(s==null){
                        throw new StudentNotFoundException();

                    }

                    int Stud_choice;
                    do{
                        System.out.println("enter 1 to view all books\n enter 2 to search book by isbn\n enter 3 to list book by subject\n enter 4 to issue a book\n enter 5 to return a book\n enter 99 to exit");
                        Stud_choice=sc.nextInt();
                        switch (Stud_choice){
                            case 1:
                                System.out.println("view all books");
                                break;
                            case 2:
                                System.out.println("search book by isbn");
                                break;
                            case 3:
                                System.out.println("list books by subject");
                                break;
                            case 4:
                                System.out.println("want to issue");
                                break;
                            case 5:
                                System.out.println("want to return");
                                break;
                            case 99:
                                System.out.println("thank you for using library");
                                break;
                            default:
                                System.out.println("invalid choice");
                        }
                    }while(Stud_choice!=99);

                }catch (StudentNotFoundException snfe){
                    System.out.println(snfe);
                }
            }

            if(choice ==2) {
                int LibChoice;
                do {
                    System.out.println("enter 11 to view all students\n enter 12 to print a student by roll no.\n enter 13 to register a student\n enter 14 to update a student\n enter 15 to delete a student");
                    System.out.println("enter 21 to view all books\n enter 22 to print a book by isbn\n enter 23 to add a new book\n enter 24 to update a book\n enter 25 to delete a book");
                    System.out.println("enter 31 to view all transaction");
                    System.out.println("enter 99 to exit ");
                    LibChoice = sc.nextInt();
                    switch (LibChoice) {
                        case 11:
                            System.out.println("list of all students ");
                            sm.ViewAllStudent();
                        case 12:
                            System.out.println("enter student's roll number ");
                            int getStudRoll = sc.nextInt();
                            Student student = sm.get(getStudRoll);
                            if (student == null) {
                                System.out.println("no record matches this roll number");
                            } else {
                                System.out.println(student);
                            }
                            break;
                        case 13:
                            System.out.println("enter student's details ");
                            String name;
                            String email;
                            String phoneNo;
                            String address;
                            String dob;
                            int rollNo;
                            int standard;
                            String division;
                            sc.nextLine();
                            System.out.println("name");
                            name = sc.nextLine();
                            System.out.println("email");
                            email = sc.nextLine();
                            System.out.println("phone number");
                            phoneNo = sc.nextLine();
                            System.out.println("address");
                            address = sc.nextLine();
                            System.out.println("date of birth");
                            dob = sc.nextLine();
                            System.out.println("Roll number");
                            rollNo = sc.nextInt();
                            System.out.println("Standard in integer");
                            standard = sc.nextInt();
                            sc.nextLine();
                            System.out.println("division");
                            division = sc.nextLine();

                            student = new Student(name, email, phoneNo, address, dob, rollNo, standard, division);
                            sm.addAStudent(student);
                            System.out.println("student is added successfully !");
                            break;
                        case 14:
                            System.out.println("enter student's roll number to modify the record ");
                            int modifyRollNumber = sc.nextInt();
                            student = sm.get(modifyRollNumber);
                            try {
                                if (student == null)
                                    throw new StudentNotFoundException();
                                sc.nextLine();
                                System.out.println("name");
                                name = sc.nextLine();
                                System.out.println("email");
                                email = sc.nextLine();
                                System.out.println("phone number");
                                phoneNo = sc.nextLine();
                                System.out.println("address");
                                address = sc.nextLine();
                                System.out.println("date of birth");
                                dob = sc.nextLine();
                                System.out.println("Standard in integer");
                                standard = sc.nextInt();
                                sc.nextLine();
                                System.out.println("division");
                                division = sc.nextLine();
                                sm.updateStudent(modifyRollNumber, name, email, phoneNo, address, dob, standard, division);
                                System.out.println("student record is updated");


                            } catch (StudentNotFoundException snfe) {
                                System.out.println(snfe);
                            }
                            break;
                        case 15:
                            System.out.println("enter student's roll number to delete the student record ");
                            int DeleteRollNumber = sc.nextInt();
                            student = sm.get(DeleteRollNumber);
                            if (sm.deleteStudent(DeleteRollNumber))
                                System.out.println("student record is deleted successfully !");
                            else
                                System.out.println("no student with the given roll number exists !");

                            break;
                        case 99:
                            System.out.println("thank you for using library");
                            break;
                        default:
                            System.out.println("invalid choice");

                    }

                }while(LibChoice!=99);
            }
        }while(choice !=3);
        sm.WriteToFile();

    }
}
