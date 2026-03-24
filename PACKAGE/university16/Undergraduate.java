package university16;

public class Undergraduate extends University {
    int marks;

    public Undergraduate(int marks, String universityName) {
        super(universityName);
        this.marks = marks;
    }

    public void checkEligibility() {
        System.out.println("University: " + universityName);
        if (marks >= 50)
            System.out.println("Admission Eligible");
        else
            System.out.println("Admission Not Eligible");
    }
}