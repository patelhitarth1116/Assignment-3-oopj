package multiple3;

public class Library implements BookDetails, FineCalculator {
    protected String bookName;
    protected String studentName;

    public Library(String bookName, String studentName) {
        this.bookName = bookName;
        this.studentName = studentName;
    }

    public void showBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Student Name: " + studentName);
    }

    public double calculateFine(int lateDays) {
        double fine = lateDays * 10;
        if (lateDays > 7) {
            fine += 50;
        }
        return fine;
    }
}