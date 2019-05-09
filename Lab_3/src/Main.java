import CutleryManager.Manager;
import Cutlery.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();


        //SpoonCutlery spon = new SpoonCutlery(3, "cds");

        PlateCutlery plate = new PlateCutlery(45.4, "cds", StructureType.DEEP);

        ForkCutlery testfork = new ForkCutlery(30, SharpnessType.MEDIUM_STATE);


        List<CutleryMain> newCutleryMainList = new ArrayList<>();

        //manager.toAdd(spon);
        manager.toAdd(plate);
        manager.toAdd(testfork);

        //System.out.println("Search by material:"+ manager.searchByMaterial(MaterialType.CERAMIC).toString()+ "\n"); //sorting by type

        System.out.println("Search by rating : "+ manager.searchByRating(30)+ "\n");

        System.out.println("Sort by price : "+ manager.sortByPrice(true)+ "\n");

        System.out.println("Sort by capacity"+ manager.sortByRating(true)+ "\n");


    }
}
