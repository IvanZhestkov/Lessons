package Informatics.home;

import java.io.*;

/**
 * Created by User on 04.04.2017.
 */
public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fin = new FileReader("input.txt");
        String name;
        int c;
        name = br.readLine();
        if (name.equals("y")) {
            while ((c = fin.read()) != -1) {
                System.out.println((char) c);
            }
        }
    }
}
