import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age>=0 && age<=12) {
            System.out.println("Ticket Price: $" + 7);
        }
        else if (age>=13 && age<=17) {
            System.out.println("Ticket Price: $" + 10);
        }
        else if (age>=18 && age<=64) {
            System.out.println("Ticket Price: $" + 15);
        }
        else {
            System.out.println("Ticket Price: $" + 7);
        }
    }
}
