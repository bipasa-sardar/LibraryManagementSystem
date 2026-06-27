package pkg_transaction;

public class BookTransaction {
    private int isbn;
    private int RollNo;
    private String IssueDate;
    private String ReturnDate;

    public BookTransaction(int isbn, int rollNo, String issueDate, String returnDate) {
        this.isbn = isbn;
        RollNo = rollNo;
        IssueDate = issueDate;
        ReturnDate = returnDate;
    }
    public BookTransaction(){
        super();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issueDate) {
        IssueDate = issueDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookTransaction{" +
                "isbn=" + isbn +
                ", RollNo=" + RollNo +
                ", IssueDate='" + IssueDate + '\'' +
                ", ReturnDate='" + ReturnDate + '\'' +
                '}';
    }
}
