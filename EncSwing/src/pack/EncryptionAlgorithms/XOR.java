package pack.EncryptionAlgorithms;

public class XOR {

    public static String encryptDecrypt(String input, String key) {
        //Def XOR key
        char xorKey = key.charAt(0);

        //Def string to store
        String output = "";

        //get length
        int len = input.length();

        for(int i = 0; i < len; i++) {
            output = output + (char)(input.charAt(i)^xorKey);
        }
        System.out.println(output);
        return output;
    }



}
