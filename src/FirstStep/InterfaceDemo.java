package FirstStep;

/**
 * Created by Volha_Sauchuk on 10/22/2015.
 */
public class InterfaceDemo {

    public static void main(String[] args) throws Exception {
        MyMath obj = new MyMath();
        int n = Mathematica.TEN/3;
        double x = (double)MyMath.TEN/n - n;
        obj.show(x, n);
    }
}

interface Mathematica {

    int TEN = 10;

    int factorial(int n);
    double power(double x, int n);
}

class MyMath implements Mathematica {

    public int factorial(int n) {
        int s=1, i;
        for (i = n; i > 0; s*=i--);
        return s;
    }

    public double power(double x, int n) {
        double s = 1;
        for (int i = 1; i <= n; s*=x, i++);
        return s;
    }

    void  show(double x, int n) {
        System.out.println("first argument: " + x);
        System.out.println("second argument: " + n);
        System.out.println("factorial: " + factorial(n));
        System.out.println("power: " + power(x,TEN));
    }
}