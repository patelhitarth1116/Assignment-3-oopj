

import library14.Library;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library lib = new Library(3);
        lib.acceptBooks();
        lib.displayBooks();

        System.out.print("\nEnter book name to search: ");
        String bname = sc.nextLine();
        lib.searchBook(bname);

        System.out.print("\nEnter author name to count books: ");
        String aname = sc.nextLine();
        lib.countBooksByAuthor(aname);
    }
}