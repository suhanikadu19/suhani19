public class Company {
    static double taxRate;
    static{
        taxRate = 18.0;
        System.out.println(" Tax rate initialized: " + taxRate + "%");
    }
    Company(){
        System.out.println("Employee object created.");

    }
    public static void main(String[] args) {
        Company emp1 = new Company();
        Company emp2 = new Company();
        System.out.println("Tax rate: " + taxRate + "%");
    }
}
