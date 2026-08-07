public class Vehicle {
    void drive() {
        System.out.println("Running");
    }
}

class Cars extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is running");
    }
}

class Main {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.drive();
    }
}