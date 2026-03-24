package course13;

import java.util.Scanner;

public class Course {
    String studentNames[];
    String courseNames[];
    int size;

    public Course(int size) {
        this.size = size;
        studentNames = new String[size];
        courseNames = new String[size];
    }

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter student name: ");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter course name: ");
            courseNames[i] = sc.nextLine();
        }
    }

    public void displayDetails() {
        System.out.println("\nStudent Course Details:");
        for (int i = 0; i < size; i++) {
            System.out.println(studentNames[i] + " - " + courseNames[i]);
        }
    }

    public void countStudentsInCourse(String course) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (courseNames[i].equalsIgnoreCase(course)) {
                count++;
            }
        }
        System.out.println("Students in " + course + ": " + count);
    }
}