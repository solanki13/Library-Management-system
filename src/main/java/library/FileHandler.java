package library;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // Save Books
    public void saveBooks(ArrayList<Book> books) {

        try {

            BufferedWriter writer
                    = new BufferedWriter(
                            new FileWriter("data/books.txt"));

            for (Book book : books) {

                writer.write(
                        book.getIsbn() + ","
                        + book.getTitle() + ","
                        + book.getAuthor() + ","
                        + book.getYear());

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving books.");
        }
    }

    // Load Books
    public ArrayList<Book> loadBooks() {

        ArrayList<Book> books
                = new ArrayList<>();

        try {

            BufferedReader reader
                    = new BufferedReader(
                            new FileReader("data/books.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Book book = new Book(
                        data[0],
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]));

                books.add(book);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No previous book data found.");
        }

        return books;
    }

    // Save Members
    public void saveMembers(
            ArrayList<Member> members) {

        try {

            BufferedWriter writer
                    = new BufferedWriter(
                            new FileWriter("data/members.txt"));

            for (Member member : members) {

                writer.write(
                        member.getId() + ","
                        + member.getName());

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving members.");
        }
    }

    // Load Members
    public ArrayList<Member> loadMembers() {

        ArrayList<Member> members
                = new ArrayList<>();

        try {

            BufferedReader reader
                    = new BufferedReader(
                            new FileReader("data/members.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Member member
                        = new Member(
                                data[0],
                                data[1]);

                members.add(member);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No previous member data found.");
        }

        return members;
    }
}
