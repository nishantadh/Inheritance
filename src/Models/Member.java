package Models;

public class Member {
    public String name;
    public int age;
    public double salaryPerDay;
    public String contact;


    public Member(String name, int age, double salaryPerDay, String contact) {
        this.name = name;
        this.age = age;
        this.salaryPerDay = salaryPerDay;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSalary(int leaves) {
        double Salary = 10 * 5 * 3.2;
        return Salary;
    }
}