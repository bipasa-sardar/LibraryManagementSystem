package pkg_transaction;

import pkg_person.Student;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BookTransactionManager {
    ObjectOutputStream oos_bookTransaction =null;
    ObjectInputStream ois_bookTransaction=null;
    File bookTransaction_file=null;
    ArrayList<BookTransaction> bookTransaction_list =null;
    public BookTransactionManager(){
        bookTransaction_file=new File("Student.dat");
        bookTransaction_list=new ArrayList<BookTransaction>();

        if(bookTransaction_file.exists()){
            try {
                ois_bookTransaction=new ObjectInputStream(new FileInputStream(bookTransaction_file));
                bookTransaction_list= (ArrayList<BookTransaction>) ois_bookTransaction.readObject();
            }catch (IOException e){
                e.printStackTrace();
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }

        }

    }
    public boolean IssueBook(int rollno, int isbn){
        int totalBookIssued=0;

        for(BookTransaction booktrans: bookTransaction_list){
            if((booktrans.getRollNo()==rollno) && (booktrans.getReturnDate()==null)){//the student already have books
                totalBookIssued+=1;
            }
            if(totalBookIssued>=3){
                return false;
            }
        }
//now the student is going to issue his required book
        String Issue_Date= new SimpleDateFormat("DD-MM-YYYY").format(new Date());//today's date

        BookTransaction book_transaction =new BookTransaction(isbn, rollno,Issue_Date,null);
        bookTransaction_list.add(book_transaction);
        return false;
    }
    public boolean returnBook(int rollno,int isbn){
        for(BookTransaction booktrans: bookTransaction_list){
            if((booktrans.getIsbn()==isbn) && (booktrans.getRollNo()==rollno)&& booktrans.getReturnDate()==null){
                String Return_Date= new SimpleDateFormat("DD-MM-YYYY").format(new Date());//today's date
                booktrans.setReturnDate(Return_Date);//return date of the book"booktrans" is set
                return true;
            }
        }
        return false;
    }
    public void ShowAll(){
        for(BookTransaction books : bookTransaction_list){
            System.out.println(books);
        }
    }
}
