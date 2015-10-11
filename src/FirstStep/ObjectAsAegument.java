package FirstStep;

public class ObjectAsAegument {

    public static void main(String[] args) {

        MyClass1 object = new MyClass1(1,'a');
        object.show();

        MakeChange(object);
        object.show();

        MakeChange(object.number, object.symb);
        object.show();
    }

    static void MakeChange(MyClass1 obj) {
        obj.number++;
        obj.symb++;
        String text = "Object-argument: field " + obj.number + " and " + obj.symb;
        System.out.println(text);
    }

    static void MakeChange(int number, char symb) {
        number++;
        symb++;
        String text = "Basic types arguments: values " + number + " and " + symb;
        System.out.println(text);
    }
}

class MyClass1 {

    int number;
    char symb;

    MyClass1(int number, char symb) {
        this.number = number;
        this.symb = symb;
    }

    void show() {
        System.out.println("Object fields: " + number + " and " + symb);
    }
}
