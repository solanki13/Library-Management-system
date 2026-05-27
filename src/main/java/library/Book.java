package library;

import java.time.LocalDate;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int year;

    private boolean available;
    private String borrowedBy;
    private LocalDate dueDate;

    // Constructor
    public Book(String isbn, String title,
            String author, int year) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;

        this.available = true;
        this.borrowedBy = null;
        this.dueDate = null;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    // Borrow book
    public void borrowBook(String memberId) {

        this.available = false;
        this.borrowedBy = memberId;

        this.dueDate = LocalDate.now().plusDays(14);
    }

    // Return book
    public void returnBook() {

        this.available = true;
        this.borrowedBy = null;
        this.dueDate = null;
    }

    // Check overdue
    public boolean isOverdue() {

        if (dueDate == null) {
            return false;
        }

        return LocalDate.now().isAfter(dueDate);
    }

    @Override
    public String toString() {

        return "ISBN: " + isbn
                + " | Title: " + title
                + " | Author: " + author
                + " | Year: " + year
                + " | Status: "
                + (available ? "Available"
                        : "Borrowed by " + borrowedBy);
    }
}
