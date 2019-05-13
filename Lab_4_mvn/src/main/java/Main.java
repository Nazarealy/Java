import CutleryManager.Manager;
import Cutlery.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();


        SpoonCutlery spon = new SpoonCutlery(10, 3, "plastik", "Eng", 7, "white");

        PlateCutlery plate = new PlateCutlery(20, 4, "metal", "Pol", 5.5, "red", StructureType.DEEP);

        ForkCutlery testfork = new ForkCutlery(35, 31, "wood", "Ukr", 4, SharpnessType.EASY_STATE);


        List<CutleryMain> newCutleryMainList = new ArrayList<>();

        manager.toAdd(spon);
        manager.toAdd(plate);
        manager.toAdd(testfork);



        System.out.println("Sort by price : " + manager.sortByPrice(true) + "\n");

        System.out.println("Sort by rating" + manager.sortByRating(true) + "\n");

        System.out.println("Search by rating" + manager.searchByRating(31) + "\n");

        System.out.println("Search by material:" + manager.searchByMaterial("wood").toString() + "\n");

    }
}
