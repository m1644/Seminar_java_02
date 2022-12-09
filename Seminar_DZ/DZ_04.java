package Seminar_DZ;
/**
 * DZ_04
 * Дано два числа, например 3 и 56, необходимо составить следующие строки: 
 * 3 + 56 = 59 
 * 3 – 56 = -53 
 * 3 * 56 = 168 
 * Используем метод StringBuilder.append().
 */
public class DZ_04 {

    public static String compilerStr(int a, int b, char sign) {
        StringBuilder str = new StringBuilder();
        str.append(a).append(" ").append(sign).append(" ").append(b).append(" = ");
        switch (sign) {
            case '+':
                str.append(a + b);
                break;
            case '-':
                str.append(a - b);
                break;
            case '*':
                str.append(a * b);
                break;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        int a = 3, b = 56;
        System.out.println("Примеры в виде строк:");
        System.out.println(compilerStr(a, b, '+'));
        System.out.println(compilerStr(a, b, '-'));
        System.out.println(compilerStr(a, b, '*'));
    }
}
