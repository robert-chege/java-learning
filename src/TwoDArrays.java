public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("Array is: ");
        printArray(array);
        System.out.println("New array transpose: ");
        transpose(array);
    }

    public static void transpose(int[][] array) {
        int[][] arrayNew = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arrayNew[j][i] = array[i][j];
            }
        }
        printArray(arrayNew);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}