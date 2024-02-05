package Models;

public class Staff extends Member {
    private int specialization;

    public Staff(String name, int age, double salaryPerDay, String contact, int specialization) {
        super(name, age, salaryPerDay, contact);
        this.specialization = specialization;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public double getSalary(int leaves) {
        double salary = super.getSalary(leaves);
        double totalSalary = salary * specialization;
        System.out.println("Total Salary: " + totalSalary);
        return salary;
    }
}