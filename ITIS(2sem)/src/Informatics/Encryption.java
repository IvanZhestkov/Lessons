package Informatics;

import java.util.Scanner;

/**
 * Created by User on 03.04.2017.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String key = sc.next();

        for(byte e: encode(text, key)) {
            System.out.print(e);
        }

        System.out.println(decode(encode(text, key), key));
    }

    public static byte[] encode(String pText, String pKey) {
        byte[] text = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] result = new byte[pText.length()];

        for (int i = 0; i < text.length; i++) {
            result[i] = (byte) (text[i] ^ key[i % pKey.length()]);
        }

        return result;
    }

    public static String decode(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return new String(res);
    }
}
