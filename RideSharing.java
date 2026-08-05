class Driver {
    String name;
    String status;

    Driver(String name, String status) {
        this.name = name;
        this.status = status;
    }
}

public class RideSharing {
    public static void main(String[] args) {

        Driver d = new Driver("Rahul", "Available");

        Driver booking1 = d;
        Driver booking2 = d;

        System.out.println("Before Change:");
        System.out.println("Booking1 Driver Status: " + booking1.status);
        System.out.println("Booking2 Driver Status: " + booking2.status);

        booking1.status = "Busy";

        System.out.println("\nAfter Change:");
        System.out.println("Booking1 Driver Status: " + booking1.status);
        System.out.println("Booking2 Driver Status: " + booking2.status);
    }
}