package tek;

import java.util.ArrayList;
import java.util.List;

public class AvenueCodeTask {

    static class Solution {

        public static void main(String[] args) {


            List<Integer> buildings = new ArrayList<Integer> ();
            buildings.add(6);
            buildings.add(7);
            buildings.add(3);
            buildings.add(4);
            buildings.add(2);

            System.out.println(oceanView(buildings));

        }

        public static List<Integer> oceanView(List<Integer> buildings){

            List <Integer> seaViewBuildings = new ArrayList <Integer>();
            for (int i=0; i<buildings.size()-1; i++){
                    if (buildings.get(i+1)>buildings.get(i)) seaViewBuildings.add(i+1);
                }
            seaViewBuildings.add (buildings.size()-1);
            return seaViewBuildings;
        }
    }
}
