package CutleryManager;

import Cutlery.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class CutleryTest {

    private List<CutleryMain> cutlery;

    private Manager iManager;



    @BeforeEach
    public void beforeEach() {
        cutlery = new ArrayList<>();
        cutlery.add(new SpoonCutlery(10, 3, "plastik", "Eng", 7, "white"));
        cutlery.add(new PlateCutlery(20, 4, "metal", "Pol", 5.5, "red", StructureType.DEEP));
        cutlery.add(new ForkCutlery(35, 31, "wood", "Ukr", 4, SharpnessType.EASY_STATE));
        iManager = new Manager(cutlery);
    }

    @Test
    void testSortPriceAscending() {
        Manager.sortByPrice(cutlery , true);
        Assertions.assertEquals(10, cutlery.get(2).getPrice());
    }

    @Test
    void testSortPriceAscendingR() {
        Manager.sortByPrice(cutlery , false);
        Assertions.assertEquals(35, cutlery.get(2).getPrice());
    }

    @Test
    void testSortProducerAscending() {
        Manager.sortByRating(cutlery , true);
        Assertions.assertEquals(4, cutlery.get(1).getRating());
    }

    @Test
    void testSortProducerAscendingR() {
        Manager.sortByRating(cutlery , false);
        Assertions.assertEquals(31, cutlery.get(2).getRating());
    }

    @Test
    void testFilterByRating() {
        Assertions.assertEquals(0, iManager.searchByMaterial("sdf").size());
        Assertions.assertEquals(0, iManager.searchByMaterial("sdfs").size());
        Assertions.assertEquals(0, iManager.searchByMaterial("fdfg").size());
    }


}