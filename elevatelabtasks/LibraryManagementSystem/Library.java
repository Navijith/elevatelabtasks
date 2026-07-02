import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int id) {

        for (Book b : books) {

            if (b.getBookId() == id) {

                if (!b.isIssued()) {

                    b.setIssued(true);

                    System.out.println("Book Issued Successfully.");

                } else {

                    System.out.println("Book Already Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public void returnBook(int id) {

        for (Book b : books) {

            if (b.getBookId() == id) {

                if (b.isIssued()) {

                    b.setIssued(false);

                    System.out.println("Book Returned Successfully.");

                } else {

                    System.out.println("Book Was Not Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }
}