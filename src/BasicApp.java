// Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard,
// add 5 to it, double it, subtract 7 from it, and display the result to the screen.
import java.util.Scanner;

public class BasicApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int userBanging = 0;

        userBanging = key.nextInt();
        userBanging = 2 * (userBanging + 5) - 7;
        System.out.println("The final result: " + userBanging);
    }
}
