package Seminar_DZ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * DZ_01
 * Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
 */
public class DZ_01 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String firstStr = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String secondStr = iScanner.nextLine();
        iScanner.close();

        Pattern pattern = Pattern.compile(secondStr);
        Matcher matcher = pattern.matcher(firstStr);
        if (matcher.find()) {
            System.out.println(
                "Вхождений в строке (содержащей все символы другой строки): "
                + firstStr.substring(matcher.start(), matcher.end()));
        } else {
            System.out.println("Вхождений в строке НЕТ!");
        }
    }   
}
