package code;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        System.out.println("Type please your text: ");
        String inputText = null;
        Algorint stringProcessor = null;

        try {
            inputText = Algorint.readInputText();
            stringProcessor = new Algorint();
            System.out.println(stringProcessor.checkNumberOfStrings(inputText));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}