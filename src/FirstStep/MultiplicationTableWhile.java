package FirstStep;

public class MultiplicationTableWhile {

    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;

        while (i < 11) {
            while (j <11) {
                if (j == 10) {
                    System.out.print(i * j + "\n");
                } else {
                    System.out.print(i * j + " ");
                }
                j++;
            }
            i++;
//            !!!! Need to return j to 1 because it's equal to 11 here Sand the next iteration won't be done
            j = 1;
        }

    }
}
