package FirstStep;

import java.io.*;

public class MidValue {

    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input value: ");
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]>array[j+1]) {
                    int s = array[j+1];
                    array[j+1] = array[j];
                    array[j] = s;
                }
            }
        }

        System.out.print(array[1]);
        //JOptionPane.showMessageDialog(null,array[2]);
    }
}
