package Informatics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by User on 14.03.2017.
 */
public class FileTest {
    public static void main(String[] args) {
        try {
            File f = new File("input.txt");
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("output.txt")));
            String s = "hfjkdjfhdfsd";
            pw.print(s);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
