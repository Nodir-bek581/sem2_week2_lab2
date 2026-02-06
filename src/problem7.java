import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretPIN = 1234;

        int attempt = 3;
        while (attempt>0) {
            System.out.print("Enter PIN: ");
            int pin = input.nextInt();
            if(pin == secretPIN) {
                System.out.print("Access Granted");
                break;
            }
            else {
                attempt--;
                if(attempt>0) {
                    System.out.print("Try again\n");
            }
                else {
                    System.out.println("Account Locked");
                }
            }
        }
    }
}
