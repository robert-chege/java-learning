import java.util.Scanner;

public class condition5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        double num = input.nextDouble();

        if (num > 0) {
            if (num < 1) {
                System.out.println("small positive no");
            } else if (num > 100000) {
                System.out.println("Large positive no");
            } else {
                System.out.println("positive no");
            }
        } else if (num < 0) {
            if (num > -1) {
                System.out.println("Small negative no");
            } else if (num < 100000) {
                System.out.println("Large negative no");
            } else {
                System.out.println("Negative no");
            }
        } else {
            System.out.println("number is zero");
        }
    }
}
