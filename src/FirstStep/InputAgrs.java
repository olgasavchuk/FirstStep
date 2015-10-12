package FirstStep;

import javax.swing.*;

public class InputAgrs {

    public static void main(String[] args) {
        String name = args[0];
        String surname = args[1];
        int age = Integer.parseInt(args[2]);
        double weight = Double.parseDouble(args[3]);

        new Fellow (name,surname,age,weight);
    }
}

class Fellow {
    String name;
    String surname;
    int age;
    double weight;

    Fellow(String name, String surname, int age, double weight) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.weight = weight;
        show();
    }

    void show() {
        JOptionPane.showMessageDialog(null, name + surname + age + weight);
    }
}
