 class Bill {


    void calculateTotal(double price) {
        System.out.println("Total = " + price);
    }

    void calculateTotal(double price, int quantity) {
        System.out.println("Total = " + (price * quantity));
    }

    void calculateTotal(double price, int quantity, double discount) {
        double total = (price * quantity) - discount;
        System.out.println("Total after Discount = " + total);
    }
}

public class ECommerce {
    public static void main(String[] args) {

        Bill b = new Bill();

        b.calculateTotal(500);
        b.calculateTotal(500, 3);
        b.calculateTotal(500, 3, 200);
    }
}

