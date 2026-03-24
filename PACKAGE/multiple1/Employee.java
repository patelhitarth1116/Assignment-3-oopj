package multiple1;

public class Employee implements EmployeeDetails, SalaryCalculations {
    protected String employeeName;
    protected int empId;
    protected double baseSalary;

    public Employee(String name, int id, double salary) {
        employeeName = name;
        empId = id;
        baseSalary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + empId);
        System.out.println("Base Salary: " + baseSalary);
    }

    public double calculateHRA() {
        return baseSalary * 0.20;
    }

    public double calculateDA() {
        return baseSalary * 0.10;
    }

    public double calculateGrossSalary() {
        return baseSalary + calculateHRA() + calculateDA();
    }
}