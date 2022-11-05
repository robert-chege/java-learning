package w3Schools.quiz;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
