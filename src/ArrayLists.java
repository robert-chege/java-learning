import java.util.ArrayList;

public class ArrayLists {
//    public static void main(String[] args) {
////        create an arraylist that print three diff types of foods.
//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("Pizza");
//        food.add("hamburger");
//        food.add("Hotdog");
//
//        food.set(0, "Sushi");
//        food.remove(2);
//        food.clear();
//
//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }

    public static void main(String args[]){
        ArrayList<String> animal = new ArrayList<String>();

        animal.add("cow");
        animal.add("goat");
        animal.add("camel");

        animal.remove(1);
        animal.set(0, "lamma");

        for(int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }
    }
}

