

import university16.Undergraduate;
import university16.Postgraduate;

public class q16 {
    public static void main(String[] args) {

        Undergraduate ug = new Undergraduate(55, "GTU");
        Postgraduate pg = new Postgraduate(45, "GTU");

        System.out.println("Undergraduate:");
        ug.checkEligibility();

        System.out.println("\nPostgraduate:");
        pg.checkEligibility();
    }
}