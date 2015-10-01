package FirstStep;

/* Ввести с клавиатуры число и имя, вывести на экран строку:
        «имя» захватит мир через «число» лет. Му-ха-ха!
        ( Последовательность вводимых данных имеет большое значение.)
*/
import java.io.*;

public class InputData {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        String name = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        System.out.print(name + " захватит мир через " + nNumber + " лет. Му-ха-ха!");
    }
}
