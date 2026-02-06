import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

        if (weight>0 && weight<=2) {
            double cost = 5;
            System.out.printf("Shipping cost: $%.2f", cost);
        }
        else if (weight>2 && weight<=10) {
            double cost = 10;
            System.out.printf("Shipping cost: $%.2f", cost);
        }
        else{
            double overweight = weight%10;
            double cost = 10+2*overweight;
            System.out.printf("Shipping Cost: $%.2f", cost);
        }
    }
}
