package CutleryManager;

import Cutlery.CutleryMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager{


    private List<CutleryMain> cutleryMainListList = new ArrayList<>();

    public void toAdd(CutleryMain dishes){
        cutleryMainListList.add (dishes);
    }

    public Manager(){
    }

    public Manager(List<CutleryMain> dishesList){
        this.cutleryMainListList= dishesList;
    }


    public List<CutleryMain> sortByPrice(boolean ascending) {
        if (ascending) {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getPrice).reversed());
        } else {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getPrice));
        }return cutleryMainListList;
    }

    public List<CutleryMain> sortByRating(boolean ascending) {
        if (ascending) {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getRating).reversed());
        } else {
            Collections.sort(cutleryMainListList, Comparator.comparing(CutleryMain::getRating));
        }return cutleryMainListList;
    }

    public List<CutleryMain> searchByRating(double rating) {
        return cutleryMainListList.stream().filter(cutlery -> cutlery.getRating() == rating).
                collect(Collectors.toList());

    }

    public List<CutleryMain> searchByMaterial(String material) {
        return cutleryMainListList.stream().filter(cutlery -> cutlery.getMaterial() == material).
                collect(Collectors.toList());

    }
}


