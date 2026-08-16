import java.util.Scanner;

// Base class
class Employee {
    public void displayRole() {
        System.out.println("Role: Employee");
    }
}

// Subclass Developer inheriting from Employee
class Developer extends Employee {
    @Override
    public void displayRole() {
        System.out.println("Role: Developer");
    }
}

// Subclass Manager inheriting from Employee
class Manager extends Employee {
    @Override
    public void displayRole() {
        System.out.println("Role: Manager");
    }
}

public class Main_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            // Declare superclass reference
            Employee emp;
            
            // Demonstrate runtime polymorphism based on user choice
            switch (choice) {
                case 1:
                    emp = new Employee();
                    break;
                case 2:
                    emp = new Developer();
                    break;
                case 3:
                    emp = new Manager();
                    break;
                default:
                    return;
            }
            
            // Calls the overridden method dynamically at runtime
            emp.displayRole();
        }
        
        scanner.close();
    }
} 
    

