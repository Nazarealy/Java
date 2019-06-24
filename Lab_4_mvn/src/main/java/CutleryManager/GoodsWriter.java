package CutleryManager;


import Cutlery.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;


public class GoodsWriter {


    public static void writeToFile(List<CutleryMain> cutlery) {
    }

    public class GoodsCutleryWriter {

        public void writeToFile(List<CutleryMain> cutleries)
                throws FileNotFoundException, IOException {
            File myFile = new File("out.csv");
            try (FileOutputStream fos = new FileOutputStream(myFile);
                 OutputStreamWriter osw = new OutputStreamWriter(fos);
                 BufferedWriter bufWriter = new BufferedWriter(osw);) {
                for (CutleryMain cutlery:cutleries) {
                    bufWriter.write(
                            cutlery.getHeaders() + "\n"
                                    + cutlery.toCSV() + "\n"
                    );
                }
            } finally {
                System.out.println();
            }
        }
    }
}
