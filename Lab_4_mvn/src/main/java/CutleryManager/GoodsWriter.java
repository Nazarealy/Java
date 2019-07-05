package CutleryManager;


import Cutlery.CutleryMain;

import java.io.*;
import java.util.List;






public class GoodsWriter {

    public static void writeToFile(List<CutleryMain> cutleries)
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