package FirstStep;

/**
 * Created by Volha_Sauchuk on 9/23/2015.
 * ������� 7 ��������, ����� �� ����� �������� 7 ������ ������ (ROYGBIV).
 * ������ ������ ��� �������� ������� �� ����� ������������ ����.
 */
public class Rainbow {

    public static void main(String[] args)
    {
        Red red = new Red();
        red.Red();

        Orange orange = new Orange();
        orange.Orange();

        Yellow yellow = new Yellow();
        yellow.Yellow();

        Green green = new Green();
        green.Green();

        Blue blue = new Blue();
        blue.Blue();

        Indigo indigo = new Indigo();
        indigo.Indigo();

        Violet violet = new Violet();
        violet.Violet();
    }

    public static class Red
    {
        public void Red() {
            System.out.println("Red");
        }
    }

    public static class Orange
    {
        public void Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow
    {
        public void Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green
    {
        public void Green() {
            System.out.println("Green");
        }
    }

    public static class Blue
    {
        public void Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo
    {
        public void Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet
    {
        public void Violet() {
            System.out.println("Violet");
        }
    }
}
