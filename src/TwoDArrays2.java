public class TwoDArrays2 {
    public static void main(String[] args) {
        String[][] twoDimensional = {
                {"1", "2"},
                {"3", "4"},
                {"6", "6"},
                {"7", "8"}
        };
        System.out.println("Display 2D array first");
        printArray(twoDimensional);
        twoDimensional[3][0] = "5";
        System.out.println("Display updated 2D array: ");
        printArray(twoDimensional);
    }

//    private static void printArray(String[][] twoDimensional) {
//        for (int i = 0; i < twoDimensional.length; i++) {
//            for (int j = 0; j < twoDimensional[i].length; j++) {
//                System.out.print(twoDimensional[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
    private static void printArray(String[][] twoDimensional){
        for(String[] row : twoDimensional){
            for(String num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
