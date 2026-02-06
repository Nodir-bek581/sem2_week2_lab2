import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int minutes = seconds/60;
        int hours = minutes/60;
        int second = seconds%60;
        int minute = second/60-hours*60;

        System.out.printf("%d hours, %d minutes, %d seconds", hours, minute, second);
    }
}
