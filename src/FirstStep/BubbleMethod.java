package FirstStep;

import javax.swing.*;

public class BubbleMethod {

    public static void main(String[] args) throws Exception {

        String text = "Initial array is: ";
        char s = 'a';

        int size = Integer.parseInt(JOptionPane.showInputDialog("Insert Array Size: "));
        char[] array = new char[size];

        //Filling out the array with random values
        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(s+(byte)(Math.random()*26));
            s++;
            text += array[i];
        }

        text += "\n Sorted array: ";

        //Sorting with Bubble Method
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]>array[j+1]) {
                    s = array[j+1];
                    array[j+1] = array[j];
                    array[j] = s;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            text += array[i] + " ";
        }

        JOptionPane.showMessageDialog(null, text);
    }
}
