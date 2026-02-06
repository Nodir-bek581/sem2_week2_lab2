import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int population = input.nextInt();
        int percent = input.nextInt();

        int doubled = population*2;
        int counter = 1;

        while (population<=doubled) {
            int i = population*percent/100+population;
            System.out.printf("Year %d: %,d%n", counter, i);
            population = population*percent/100+population;
            ++counter;
        }
        System.out.println("It will take " + (--counter) + " years to double");
    }
}
