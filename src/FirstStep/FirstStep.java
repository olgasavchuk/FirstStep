package FirstStep;

/* ���� ���� ����
������� �� ����� ��� ��������� ���������� ���� �����, �����, �����.
���������: �� 6 ����. ������ ���������� ������� � ����� ������. ����� �� ���������. ������:
������������
������������
...
*/

public class FirstStep
{
    public static void main(String[] args)
    {
        int [] a1 = new int [] {1,2,3};
        int [] a2 = new int [3];

        for (int i = 0; i < a1.length; i++)
        {
            for (int j = 0; j < a1.length; j++)
            {
                if (j != i)
                {
                    for (int k = 0; k < a1.length; k++)
                    {
                        if ((k != j)&&(k != i))
                        {
                            a2[0] = a1[i];
                            a2[1] = a1[j];
                            a2[2] = a1[k];

                            for (int m = 0; m < a2.length; m++)
                            {
                                System.out.print(a2[m]);
                            }
                            System.out.println();
                        }
                    }
                }

            }
        }
    }
}