package pkg_main;

import pkg_book.BookManager;
import pkg_exception.StudentNotFoundException;
import pkg_person.Student;
import pkg_person.StudentManager;
import pkg_transaction.BookTransactionManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        }while(choice !=3);

    }
}
