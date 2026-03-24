

import multiple1.Manager;

public class multiple1 {
    public static void main(String[] args) {

        Manager m = new Manager("Hitarth", 101, 30000, 5000);

        m.displayEmployeeDetails();
        System.out.println("HRA: " + m.calculateHRA());
        System.out.println("DA: " + m.calculateDA());
        System.out.println("Gross Salary: " + m.calculateGrossSalary());
    }
}