package FirstStep;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Created by Volha_Sauchuk on 9/24/2015.
 */
public class RaggedMassive {

    public static void main(String[] args) throws Exception {

        //Reading numbers from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Insert max number: ");
        int max = Integer.parseInt(reader.readLine());

        System.out.print("Insert min number: ");
        int min = Integer.parseInt(reader.readLine());

        //Call method to find the random array size
        FindMassiveSize random_size = new FindMassiveSize();
        int size = random_size.FindRandomSize(max,min);

        System.out.print("Array Size is: " + size);

        //Array creation
        CreateArray raggedArray = new CreateArray();
        raggedArray.Array(size);

    }

    //Class for finding random number to define the array size
    public static class FindMassiveSize {

        public int FindRandomSize(int max, int min) {

            int range = Math.abs(max - min) + 1;
            int random_number = (int)(Math.random()*range)+(min <= max ? min : max);

            return random_number;
        }

    }

    public static class CreateArray {

        public void Array(int size) {

            int n;
            char s = 'a';
            String text = "\nRagged array: ";

            char[][] array = new char[size][];

            // Add rows to array
            for (int k = 0; k < size; k++) {
                n = 1 + (int)(Math.random()*8);
                array[k] = new char[n];
            }
            // Fill out the rows
            for (int i = 0; i < array.length; i++) {

                text+="\n|";

                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = s;
                        s++;
                        text+=array[i][j]+ " | ";
                    }
                }

            System.out.print(text);
            //JOptionPane.showMessageDialog(null, text); //doesn't work...
        }
    }

}