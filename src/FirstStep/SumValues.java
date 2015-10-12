package FirstStep;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumValues {

    public static void main(String[] args)   throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int sum = 0;

        while (true) {
            n = Integer.parseInt(reader.readLine());
            sum += n;
            if (n == -1) {
                System.out.println(sum);
                break;
            }

        }

    }

}
