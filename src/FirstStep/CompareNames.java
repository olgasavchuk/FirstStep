package FirstStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNames {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1 == name2) {
            System.out.print("Имена идентичны");
        }
        else {
            if (name1.length() == name2.length()) {
                System.out.print("Длины имен равны");
            }
        }
    }
}
