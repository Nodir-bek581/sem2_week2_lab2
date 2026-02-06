import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double efficiency = 8.5/100;
        int price = 12500;

        double fuel = distance*efficiency;
        double cost = fuel*price;

        System.out.printf("Distance: %d km%n", distance);
        System.out.printf("Fuel needed: %.2f Liters%n", fuel);
        System.out.printf("Total cost: %,.2f UZS%n", cost);
    }
}
