public class FormValidation {
    public static void main(String[] args) {
        String ageInput = "20"; 
        int age = Integer.parseInt(ageInput);

    
        if (age >= 18) {
            System.out.println("User age: " + age + " - Eligible.");
        } else {
            System.out.println("User age: " + age + " - Not Eligible.");
        }
    }
}