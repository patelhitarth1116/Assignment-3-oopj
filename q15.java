

import result15.Result;
import java.util.Scanner;

public class q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Name: ");
        r.name = sc.nextLine();

        System.out.print("Enter Age: ");
        r.age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        r.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        r.marks = sc.nextInt();

        r.calculateGrade();
        System.out.println("\nResult Details:");
        r.showDetails();
    }
}