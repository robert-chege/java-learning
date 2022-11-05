public class Loops {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 77};
        System.out.println("Is seven in the array?");
        System.out.println(sevenBoom(array));

    }

    public static String sevenBoom(int[] arr){
       for(int num: arr){
           if(num == 7) return "Boom";
//           String s = Integer.toString(i);
//           if(s.contains("7")){
//               return "Boom!";
//           }
       }
       return "There is no 7 in the array.";
    }

}
