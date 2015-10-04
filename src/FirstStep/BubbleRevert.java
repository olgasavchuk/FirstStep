package FirstStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleRevert {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert array size:");
        int n = Integer.parseInt(reader.readLine());

        int [] array = new int[n];
        int s;



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
