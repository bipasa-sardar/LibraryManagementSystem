package pkg_book;
import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookManager{
    ObjectOutputStream oos_book=null;//ObjectOutputStream is used for serialization .It Converts a Java object into a byte stream and writes it to a file (or network, etc.)
       //the class you want to serialize must implement Serializable:
    ObjectInputStream ois_book=null;//ObjectInputStream is used for deserialization.It Reads that byte stream back and reconstructs the object
//    Basically loads the object's state

    File book_file = new File("Books.dat");
    static  ArrayList<Book> book_list = null;
    public BookManager(){
        book_list=new ArrayList<>();
        if(book_file.exists()){
            try {
                ois_book=new ObjectInputStream(new FileInputStream(book_file));
                book_list=(ArrayList<Book>) ois_book.readObject();
            }catch (IOException e){//for ois_book
                e.printStackTrace();
            }
            catch (ClassNotFoundException e){//for book_list
                e.printStackTrace();
            }

        }
    }
    public void AddABook(Book book){
        book_list.add(book);
    }
    public void ViewAllBooks(){
        for(Book b : book_list){
            System.out.println(b);

        }
    }
    public Book SearchByIsbn(int Search_isbn){
        for(Book b : book_list){
            if(b.getIsbn()==Search_isbn){
                return b;
            }
        }
        return null;
    }
    public boolean deleteBook(int delete_isbn){
        ListIterator<Book> book_iterator= (ListIterator<Book>) book_list.listIterator();
        while(book_iterator.hasNext()){
            Book b= book_iterator.next();

            if(b.getIsbn()==delete_isbn){
                book_list.remove(b);
                return true;
            }
        }
        return false;
    }

}
