package multiple1;

public class Manager extends Employee {
    double bonusAmount;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        bonusAmount = bonus;
    }

    public double calculateGrossSalary() {
        return baseSalary + calculateHRA() + calculateDA() + bonusAmount;
    }
}