package FirstStep;

/**
 * Created by Volha_Sauchuk on 9/23/2015.
 * ������ �� ����� ������� ��������� 10 �� 10 � ��������� ����:
 * 1 2 3 �
 * 2 4 6 �
 * 3 6 9 �
 �
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int a, b;
        for (a = 1; a < 11; a++) {
            for (b = 1; b < 11; b++) {
                System.out.print(a * b + " " );
            }
            System.out.println();
        }
    }
}
