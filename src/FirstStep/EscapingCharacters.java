package FirstStep;

/**
 * Created by Volha_Sauchuk on 9/23/2015.
 * ������������� ��������
 * ��� ������������� �������� � Java ������� � �������������� ��������� � ������.
 * ������� �� ����� ��������� ����� - ��� ������:
 * It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */
public class EscapingCharacters {
    public static void main(String[] args)
    {
        String s1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String s2 = "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";

        System.out.println(s1);
        System.out.println(s2);

    }

}
