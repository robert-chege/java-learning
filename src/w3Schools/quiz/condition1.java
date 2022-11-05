package w3Schools.quiz;

import java.util.Scanner;

public class condition1 {
    public static void main(String[] args) {
     int n=0, s=0;
        System.out.println("Input 5 numbers: ");
        for(int i = 0; i < 5; i++){
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        int avg = s/5;
        System.out.println("The sum of the 5 numbers is : " + s + "\nThe Average is: " + avg);
    }
}
