import java.util.Scanner;

public class TwoDArrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Please enter the values to be added: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("The values entered are: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
