package library;

import java.util.ArrayList;

public class Member {

    // Variables
    private String id;
    private String name;

    private ArrayList<String> borrowedBooks;

    // Constructor
    public Member(String id, String name) {

        this.id = id;
        this.name = name;

        borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow book
    public void borrowBook(String isbn) {

        borrowedBooks.add(isbn);
    }

    // Return book
    public void returnBook(String isbn) {

        borrowedBooks.remove(isbn);
    }

    // Display member details
    @Override
    public String toString() {

        return "Member ID: " + id
                + " | Name: " + name
                + " | Borrowed Books: "
                + borrowedBooks.size();
    }
}
