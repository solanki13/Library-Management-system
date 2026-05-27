package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");

            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Books");
            System.out.println("4. Register Member");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Library Statistics");
            System.out.println("8. Remove Book");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Book
                case 1:

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    Book book = new Book(isbn,
                            title,
                            author,
                            year);

                    library.addBook(book);

                    break;

                // View Books
                case 2:

                    library.displayBooks();

                    break;

                // Search Books
                case 3:

                    System.out.print("Enter keyword: ");

                    String keyword = sc.nextLine();

                    library.searchBooks(keyword);

                    break;

                // Register Member
                case 4:

                    System.out.print("Enter Member ID: ");

                    String memberId = sc.nextLine();

                    System.out.print("Enter Member Name: ");

                    String memberName = sc.nextLine();

                    Member member
                            = new Member(memberId,
                                    memberName);

                    library.registerMember(member);

                    break;

                // Borrow Book
                case 5:

                    System.out.print("Enter ISBN: ");

                    String borrowIsbn = sc.nextLine();

                    System.out.print("Enter Member ID: ");

                    String borrowMemberId
                            = sc.nextLine();

                    library.borrowBook(
                            borrowIsbn,
                            borrowMemberId);

                    break;

                // Return Book
                case 6:

                    System.out.print("Enter ISBN: ");

                    String returnIsbn = sc.nextLine();

                    System.out.print("Enter Member ID: ");

                    String returnMemberId
                            = sc.nextLine();

                    library.returnBook(
                            returnIsbn,
                            returnMemberId);

                    break;

                // Statistics
                case 7:

                    library.displayStatistics();

                    break;

                // Remove Book
                case 8:

                    System.out.print("Enter ISBN: ");

                    String removeIsbn
                            = sc.nextLine();

                    library.removeBook(removeIsbn);

                    break;

                // Exit
                case 9:

                    System.out.println("Exiting system...");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
