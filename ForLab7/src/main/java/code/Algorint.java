package code;


import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Algorint {
    public static String readInputText() throws IOException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public String checkNumberOfStrings(final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        final Pattern p = Pattern.compile("[aeiou]*", Pattern.CASE_INSENSITIVE);
        //String[] outputString = string.charAt(0 );    //should use charAt()
        String[] outputString = string.split("\\s*");

        for (int i = 0; i < outputString.length; i++) {
            String cstr = p.matcher(outputString[i]).replaceAll("");
            if (cstr.length() >= 5) { //for lenght of words
                stringBuilder.append(outputString[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public String showResults(final StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }
}