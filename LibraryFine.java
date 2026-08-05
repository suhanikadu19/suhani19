import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = sc.nextInt();
        int fine = daysLate * 5;
        System.out.println("The library fine is: " + fine);
    
    sc.close();
    }
}
