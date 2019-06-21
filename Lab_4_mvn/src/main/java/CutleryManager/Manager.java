package CutleryManager;

import Cutlery.CutleryMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {


    private static List<CutleryMain> cutleryMainListList = new ArrayList<>();

    public Manager() {
    }

    public Manager(List<CutleryMain> goodsList) {
        this.cutleryMainListList = goodsList;
    }

    public final void toAdd(final CutleryMain goods) {
        cutleryMainListList.add(goods);
    }

    public static List<CutleryMain> sortByPrice(List<CutleryMain> cutlery, final boolean ascending) {
        if (ascending) {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getPrice).reversed());
        } else {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getPrice));
        }
        return cutleryMainListList;
    }

    public static List<CutleryMain> sortByRating(List<CutleryMain> cutlery, final boolean ascending) {
        if (ascending) {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getRating).reversed());
        } else {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getRating));
        }
        return cutleryMainListList;
    }

   // public List<CutleryMain> searchByRating() {
     //   return cutleryMainListList.stream().filter(cutlery -> cutlery.getRating() == rating).
       //         collect(Collectors.toList());

  //  }

    public List<CutleryMain> searchByMaterial(final String material) {
        return cutleryMainListList.stream().filter(cutlery -> cutlery.getMaterial() == material).
                collect(Collectors.toList());

    }
}