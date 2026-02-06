import java.util.Scanner;

public class problem10 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        int interest = input.nextInt();;
        int years = input.nextInt();

        for (int i = 0; i<=years; i++) {
            double newBalance = balance + (balance*interest/100);
            System.out.printf("Year %d: $%.2f%n", i, newBalance);
            balance = balance + (balance*interest/100);
        }
    }
}
