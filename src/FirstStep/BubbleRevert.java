package FirstStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleRevert {

    public static void main(String[] args) throws IOException {

        int [] array = new int[4];
        int s;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input a number:");
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]<array[j+1]) {
                    s = array[j+1];
                    array[j+1] = array[j];
                    array[j] = s;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
