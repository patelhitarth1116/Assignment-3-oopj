

import multiple3.Library;

public class multiple3{
    public static void main(String[] args) {

        Library lib = new Library("Java Programming", "Hitarth");

        lib.showBookInfo();
        double fine = lib.calculateFine(10);

        System.out.println("Total Fine: " + fine);
    }
}