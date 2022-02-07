package pack.EncryptionAlgorithms;

public class CaesarCipher {

    public static String encrypt(String text, int s) {
        s=s%26;
        StringBuffer result = new StringBuffer();

        for(int i = 0; i<text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + s - 65+26)% 26 +65);
                result.append(ch);
            }
            else{
                char ch = (char)(((int)text.charAt(i) + s - 97+26)% 26 +97);
                result.append(ch);
            }
        }

        return result.toString();
    }

}
