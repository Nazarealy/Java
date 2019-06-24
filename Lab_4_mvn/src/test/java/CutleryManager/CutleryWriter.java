package CutleryManager;

import Cutlery.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CutleryWriter {




    class goodsWriterTest {

        private List<CutleryMain> cutlery;

        public void setUp() {
            cutlery = new ArrayList<>();
        }

        @BeforeEach
        public void beforeEach() {
            cutlery = new ArrayList<>();
            cutlery.add(new SpoonCutlery(10, 3, "plastik", "Eng", 7, "white"));
            cutlery.add(new PlateCutlery(20, 4, "metal", "Pol", 5.5, "red", StructureType.DEEP));
            cutlery.add(new ForkCutlery(35, 31, "wood", "Ukr", 4, SharpnessType.EASY_STATE));
        }

        @Test
        public void testWriteToFile() throws FileNotFoundException, IOException {
            GoodsWriter.writeToFile(cutlery);
            File myFile = new File("out.csv");
            try (FileInputStream fis = new FileInputStream(myFile);
                 InputStreamReader isr = new InputStreamReader(fis);
                 BufferedReader bufReader = new BufferedReader(isr);) {
                String line = null;
                String lines = "";
                while ((line = bufReader.readLine()) != null) {
                    lines += line + "\n";
                }
                lines = lines.substring(0, lines.length() - 1);
                System.out.println(lines);
                Assertions.assertEquals("",lines);
            } finally {
                System.out.println();
            }
        }

    }
}
