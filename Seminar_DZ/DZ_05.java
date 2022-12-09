package Seminar_DZ;
/**
 * DZ_05
 * Замените символ “=” на слово “равно”. 
 * Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
 */
public class DZ_05 {

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

    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }

    public static void main(String[] args) {
        int a = 3, b = 56;
        System.out.println("Примеры в виде строк:");
        System.out.println(compilerStr(a, b, '+'));
        System.out.println(compilerStr(a, b, '-'));
        System.out.println(compilerStr(a, b, '*'));
        System.out.println("Замена символа '=' на слово 'равно':");
        System.out.println(replacEqual(compilerStr(a, b, '+')));
        System.out.println(replacEqual(compilerStr(a, b, '-')));
        System.out.println(replacEqual(compilerStr(a, b, '*')));
    }
}
