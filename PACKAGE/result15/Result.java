package result15;

public class Result {
    public String name;
    public int age;
    public int rollNo;
    public int marks;
    public String grade;

    public void calculateGrade() {
        if (marks >= 80)
            grade = "A";
        else if (marks >= 60)
            grade = "B";
        else if (marks >= 40)
            grade = "C";
        else
            grade = "Fail";
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
