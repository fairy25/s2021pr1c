package tut7;

public class Book {
    String title;
    Author[] authors;
    Publisher publisher;
    int publishYear;
    int edition;
    Person borrower;
    int borrowDate;
    int returnDate;

    public Book(String t, Author[] a, Publisher p, int py, int ed) {
        title = t;
        authors = a;
        publisher = p;
        publishYear = py;
        edition = ed;
    }
}
