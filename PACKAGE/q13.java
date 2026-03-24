

import course13.Course;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course c = new Course(3);
        c.acceptDetails();
        c.displayDetails();

        System.out.print("\nEnter course name to count students: ");
        String course = sc.nextLine();

        c.countStudentsInCourse(course);
    }
}