package FirstStep;

import javax.swing.*;

public class StaticFields {

    public static void main(String[] args) {

        MyClass A = new MyClass(10,200);

        MyClass.N1 = -50;
        A.show();

        MyClass B = new MyClass(1,2);
        A.show();

        B.N1 = -1;
        B.N2 = -2;

        A.show();
        B.show();

    }
}

class MyClass {

    static int N1;
    int N2;

    MyClass(int n1, int n2) {

        N1 = n1;
        N2 = n2;

        String text = "New Object created!\n";
        text += "Static field: "+ N1 +"\n";
        text += "NonStatic field: "+ N2;
        JOptionPane.showMessageDialog(null, text);
    }

    void show() {

        String text = "Object fields:\n";
        text += "Static field: "+ N1 +"\n";
        text += "NonStatic field: "+ N2;
        JOptionPane.showMessageDialog(null, text);

    }
}