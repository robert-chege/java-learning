package kim;

import java.util.ArrayList;
import java.util.List;

public class HouseSystem {
    public static void main(String[] args) {
        String[] names = new String[]{"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};

        List<Building> buildings = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Building b = new Building(names[i]);
            buildings.add(b);
        }

        while(true) {
            for(Building b: buildings) {
                if(b.impact() > 0) {
                    System.out.println(b);
                }
            }
            System.out.println("\n");

            try {
                Thread.sleep(5000);
            } catch(Exception e) {
                e.printStackTrace();
            }

            for(Building b: buildings) {
                b.randomize();
            }
        }

    }


}





