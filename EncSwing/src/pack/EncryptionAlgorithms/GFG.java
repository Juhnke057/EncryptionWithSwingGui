package pack.EncryptionAlgorithms;

import java.util.Locale;

public class GFG {

    public static String decode(String input) {
        String output = "";

        boolean found = false;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==' ') {
                found = false;
                continue;
            }
            if(!found) {
                if((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= 'a' && input.charAt(i) >= 'z')) {
                    output += Character.toString(input.charAt(i));
                    found = true;
                }
            }
        }
        return output.toLowerCase();
    }

}
