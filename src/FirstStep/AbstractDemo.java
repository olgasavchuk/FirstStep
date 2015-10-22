package FirstStep;

/**
 * Created by Volha_Sauchuk on 10/22/2015.
 */
public class AbstractDemo {

    public static void main(String[] args) throws Exception {

        BaseA A = new BaseA();
        Base B = new BaseB();
        A.show(5);
        B.show(5);
    }
}

abstract class Base {

    String operation;

    Base(String str) {
        operation = str;
    }

    abstract int F(int n);

    void show(int n) {
        System.out.println("Operation: " + operation);
        System.out.println("Argument : " + n);
        System.out.println("Value: " + F(n));
    }
}

class BaseA extends Base {

    BaseA() {
        super("factorial");
    }

    int F(int n) {
        if (n == 1) return 1;
        else return n * F(n - 1);
    }
}
class BaseB extends Base {

    BaseB() {
        super("double factorial");
    }
    int F(int n) {
        if (n == 1 || n == 2) return n;
        else return n*F(n-2);
    }
}
