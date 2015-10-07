package FirstStep;

/*Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.*/

public class S10 {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;

        while (i < 11) {
            while (j <11) {
                if (j == 10) {
                    System.out.print("S\n");
                } else {
                    System.out.print("S");
                }
                j++;
            }
            i++;
//            !!!! Need to return j to 1 because it's equal to 11 here Sand the next iteration won't be done
            j = 1;
        }

    }
}
