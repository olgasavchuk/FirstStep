package FirstStep;

public class SubClassDemo {

    public static void main(String[] args) {

        SubClass obj = new SubClass();
        obj. setAll(100, "Text", 'A');
        obj.show();
        obj.setNumber(20);
        obj.name = "New";
        obj.show();
    }
}

class SuperClass {

    int number;
    String name;

    void setNumber(int n) {
        number = n;
    }
}

class SubClass extends SuperClass {

    char symbol;
    void setAll(int n, String txt, char s) {
        setNumber(n);
        name = txt;
        symbol = s;
    }

    void show() {
        System.out.println(number);
        System.out.println(name);
        System.out.println(symbol);
    }
}