package CutleryManagerforTESTS;


import Cutlery.*;
import CutleryManager.GoodsWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CutleryWriterforTest {

    private List<CutleryMain> cutleries;

    public void setUp() {
        cutleries = new ArrayList<>();
    }

    @BeforeEach
    public void beforeEach() {
        cutleries = new ArrayList<>();
        cutleries.add(new SpoonCutlery(10, 3, "plastik", "Eng", 7, "white"));
        cutleries.add(new PlateCutlery(20, 4, "metal", "Pol", 5.5, "red", StructureType.DEEP));
        cutleries.add(new ForkCutlery(35, 31, "wood", "Ukr", 4, SharpnessType.EASY_STATE));

    }

    @Test
    public void testWriteToFile() throws FileNotFoundException, IOException {
        GoodsWriter.writeToFile(cutleries);
        File myFile = new File("out.csv");
        try (FileInputStream fis = new FileInputStream(myFile);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr);) {
            String line = null;
            String lines = "";
            while ((line = bufReader.readLine()) != null) {
                lines += line + "\n";
            }
            System.out.println(lines);
            Assertions.assertEquals(lines, "price,rating,material,production,lenght,color\n" +
                    "10.0,3.0,plastik,Eng,7,white\n" +
                    "price,rating,material,production,diagonal,color,structure\n" +
                    "20.0,4.0,metal,Pol,5.5,red,DEEP\n" +
                    "price,rating,material,production,needlesnumber,sharpness\n" +
                    "35.0,31.0,wood,Ukr,4,EASY_STATE\n");
        } finally {
            System.out.println();
        }
    }

}
