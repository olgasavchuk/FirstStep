package FirstStep;

/**
 * Created by Volha_Sauchuk on 9/23/2015.
 * ¬ыведи на экран таблицу умножени€ 10 на 10 в следующем виде:
 * 1 2 3 Е
 * 2 4 6 Е
 * 3 6 9 Е
 Е
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
