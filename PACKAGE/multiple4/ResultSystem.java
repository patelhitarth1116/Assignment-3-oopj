package multiple4;

public class ResultSystem implements TheoryMarks, PracticalMarks {
    protected int theory;
    protected int practical;

    public void getTheoryMarks(int marks) {
        theory = marks;
    }

    public void getPracticalMarks(int marks) {
        practical = marks;
    }

    public void showResult() {
        int total = theory + practical;
        System.out.println("Total Marks: " + total);

        if (total >= 75)
            System.out.println("Result: Distinction");
        else if (total >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}