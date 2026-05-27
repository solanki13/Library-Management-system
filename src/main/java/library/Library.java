package library;

import java.util.ArrayList;

public class Library {

    // ArrayLists
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    private FileHandler fileHandler;

    public Library() {

        fileHandler = new FileHandler();

        books = fileHandler.loadBooks();

        members = fileHandler.loadMembers();
    }

    // Add Book
    public void addBook(Book book) {

        books.add(book);

        fileHandler.saveBooks(books);

        System.out.println("Book added successfully!");
    }

    // View All Books
    public void displayBooks() {

        if (books.isEmpty()) {

            System.out.println("No books available.");
            return;
        }

        System.out.println("\n=== BOOK LIST ===");

        for (Book book : books) {

            System.out.println(book);
        }
    }

    // Search Book by ISBN
    public Book findBookByIsbn(String isbn) {

        for (Book book : books) {

            if (book.getIsbn().equals(isbn)) {

                return book;
            }
        }

        return null;
    }

    // Register Member
    public void registerMember(Member member) {

    members.add(member);

    fileHandler.saveMembers(members);

    System.out.println("Member registered successfully!");
}

    // Find Member
    public Member findMemberById(String id) {

        for (Member member : members) {

            if (member.getId().equals(id)) {

                return member;
            }
        }

        return null;
    }

    // Borrow Book
    public void borrowBook(String isbn, String memberId) {

        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book == null) {

            System.out.println("Book not found!");
            return;
        }

        if (member == null) {

            System.out.println("Member not found!");
            return;
        }

        if (!book.isAvailable()) {

            System.out.println("Book already borrowed!");
            return;
        }

        book.borrowBook(memberId);

        member.borrowBook(isbn);

        fileHandler.saveBooks(books);
        fileHandler.saveMembers(members);

        System.out.println("Book borrowed successfully!");
        System.out.println("Due Date: "
                + book.getDueDate());
    }

    // Return Book
    public void returnBook(String isbn,
            String memberId) {

        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book == null || member == null) {

            System.out.println("Invalid book or member!");
            return;
        }

        book.returnBook();

        member.returnBook(isbn);

        fileHandler.saveBooks(books);
        fileHandler.saveMembers(members);

        System.out.println("Book returned successfully!");
    }

    // Search Books
    public void searchBooks(String keyword) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().toLowerCase()
                    .contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase()
                            .contains(keyword.toLowerCase())) {

                System.out.println(book);

                found = true;
            }
        }

        if (!found) {

            System.out.println("No matching books found.");
        }
    }

    // Remove Book
    public void removeBook(String isbn) {

        Book book = findBookByIsbn(isbn);

        if (book == null) {

            System.out.println("Book not found!");
            return;
        }

        books.remove(book);

        fileHandler.saveBooks(books);

        System.out.println("Book removed successfully!");
    }

    // Statistics
    public void displayStatistics() {

        int totalBooks = books.size();

        int borrowedBooks = 0;

        for (Book book : books) {

            if (!book.isAvailable()) {

                borrowedBooks++;
            }
        }

        int availableBooks
                = totalBooks - borrowedBooks;

        System.out.println("\n=== LIBRARY STATISTICS ===");

        System.out.println("Total Books: "
                + totalBooks);

        System.out.println("Available Books: "
                + availableBooks);

        System.out.println("Borrowed Books: "
                + borrowedBooks);

        System.out.println("Registered Members: "
                + members.size());
    }
}
