package pkg_book;

public class Book {
    private int isbn;
    private String Title;
    private String Author;
    private String Publisher;
    private String Edition;
    private String Subject;
    private int Available_quantities;

    public Book(int isbn,String Title,String Author,String Publisher,String Edition,String Subject,int Available_quantities) {
        this.isbn = isbn;
        this.Title = Title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Edition = Edition;
        this.Subject= Subject;
        this.Available_quantities = Available_quantities;
    }//parameterised constructor




    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getSubject() {return Subject;}

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getAvailable_quantities() {
        return Available_quantities;
    }

    public void setAvailable_quantities(int available_quantities) {
        Available_quantities = available_quantities;
    }


    @Override
    public String toString() {//to print details of the book
        return "book{" +
                "isbn=" + isbn +
                ", Title='" + Title  +
                ", Author='" + Author +
                ", Publisher='" + Publisher +
                ", Edition='" + Edition +
                ", Subject='" + Subject +
                ", Available_quantities=" + Available_quantities +
                '}';
    }
}
