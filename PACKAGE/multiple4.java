

import multiple4.ResultSystem;

public class multiple4 {
    public static void main(String[] args) {

        ResultSystem r = new ResultSystem();

        r.getTheoryMarks(40);
        r.getPracticalMarks(35);

        r.showResult();
    }
}