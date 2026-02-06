import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the quantity of cappuccinos:");
                double cappuccinos = input.nextInt();
                System.out.print("Enter muffins:");
                double muffins = input.nextInt();

                double total = (cappuccinos*4.5+3*muffins)*8/100+5+cappuccinos*4.5+3*muffins;

                System.out.printf("Grand total: $%.2f", total);
}
}