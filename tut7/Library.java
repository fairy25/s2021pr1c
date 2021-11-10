package tut7;

public class Library {
    Book[] books;

    public Library() {
        books = new Book[5];
        Author a1 = new Author("Sedgewick");
        Author a2 = new Author("Wayne");
        Author a3 = new Author("Horstmann");
        Author a4 = new Author("Liskov");
        Author a5 = new Author("Guttag");
        Author a6 = new Author("Sommerville");
        Author a7 = new Author("Beck");
        Publisher p1 = new Publisher("Addison-Wesley");
        Publisher p2 = new Publisher("John Wiley & Sons");
        Publisher p3 = new Publisher("Pearson");
        books[0] = new Book("Introduction to programming in Java",
                new Author[]{a1, a2},
                p1, 2017, 1);
        books[1] = new Book("Big Java",
                new Author[]{a3},
                p2, 2009, 2);
        books[2] = new Book("Program Development in Java",
                new Author[]{a4, a5},
                p1, 2001, 1);
        books[3] = new Book("Software Engineering",
                new Author[]{a6},
                p3, 2016, 10);
        books[4] = new Book("Test-driven Development",
                new Author[]{a7},
                p1, 2003, 1);
    }

    public void borrow(Person p, Book b) {
        b.borrower = p;
        b.borrowDate = 20;
        b.returnDate = 26;
    }

    public void returnBook(Book b) {
        b.borrower = null;
        b.borrowDate = 0;
        b.returnDate = 0;
    }

    public void bookStatus() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book #" + (i + 1));
            System.out.println("Title: " + books[i].title);
            System.out.print("Status: ");
            Person borrower = books[i].borrower;
            if (borrower == null) {
                System.out.println("Not borrowed");
            } else {
                System.out.println("Borrowed by '" + borrower.name + "', " +
                        "from " + books[i].borrowDate + " to " + books[i].returnDate);
            }
        }
    }

    public void searchByPublisher(String pn) {
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            Publisher p = b.publisher;
            if (p.name.equals(pn)) {
                System.out.println(b.title);
            }
        }
    }

    public static void main(String[] args) {
        // scenario 1: Mr. Quan borrows the book: Introduction to programming in Java
        Library lib = new Library();
        Person p = new Person("Quan", "Hanoi", "0123456789", "80234023940");
        Book b = lib.books[0];
        lib.borrow(p, b);

        // scenario 2: Librarian wants to know which books have been borrowed, by whom
        // lib.bookStatus();

        // scenario 3: list all books by Addison-Wesley
        // lib.searchByPublisher("Addison-Wesley");

        // scenario 4: Mr. Quan returns the book
        lib.returnBook(b);
        lib.bookStatus();
    }
}
