package library14;

import java.util.Scanner;

public class Library {
    String bookNames[];
    String authorNames[];
    int totalBooks;

    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
        bookNames = new String[totalBooks];
        authorNames = new String[totalBooks];
    }

    public void acceptBooks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < totalBooks; i++) {
            System.out.print("Enter book name: ");
            bookNames[i] = sc.nextLine();

            System.out.print("Enter author name: ");
            authorNames[i] = sc.nextLine();
        }
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < totalBooks; i++) {
            System.out.println(bookNames[i] + " - " + authorNames[i]);
        }
    }

    public void searchBook(String bookName) {
        boolean found = false;
        for (int i = 0; i < totalBooks; i++) {
            if (bookNames[i].equalsIgnoreCase(bookName)) {
                System.out.println("Book Found: " + bookNames[i] + " - " + authorNames[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not available");
        }
    }

    public void countBooksByAuthor(String authorName) {
        int count = 0;
        for (int i = 0; i < totalBooks; i++) {
            if (authorNames[i].equalsIgnoreCase(authorName)) {
                count++;
            }
        }
        System.out.println("Books by " + authorName + ": " + count);
    }
}