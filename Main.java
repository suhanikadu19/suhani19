class Employee {

    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {

        if (amount > 0) {
            salary = salary + amount;
            System.out.println("Salary increased.");
        } else {
            System.out.println("Salary cannot be decreased.");
        }
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(30000);

        emp.displaySalary();

        emp.increaseSalary(5000);
        emp.displaySalary();

        emp.increaseSalary(-2000);
        emp.displaySalary();
    }
}