package Seminar_Task;

import java.util.Arrays;
import java.util.Random;
/**
 * Task_01
 */
public class Task_01 {

    public static void main(String[] args) {

        // Integer i;
        // Float f;
        // Double d;

        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        System.out.println(a + " & " + b);

        System.out.println(Integer.toBinaryString(new Random().nextInt(50)).length());

        int c = Integer.parseInt("123");    // строку в число
        System.out.println(c);
        String e = String.valueOf(123);    // число в строку
        System.out.println(e);
        Float.toHexString(0.44f);
        // Character ch;
        Character.getName(4);

        int[] ints = new int[8];    // по умолчанию [0,0,0,0,0,0,0,0]
        System.out.println(Arrays.toString(ints));
        int[] tmp = new int[ints.length+ints.length/2+1];
        for (int j = 0; j < ints.length; j++) {
            tmp[j] = ints[j];
        }
        ints = tmp;
        System.out.println(Arrays.toString(ints));

        int[] ints1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println(ints1.length);    // вывод кол-во эл-ов массива
        System.out.print(Arrays.toString(ints1));    // вывод массива в строку

        String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        for (int s = 0; s < 4; s++) {
            System.out.println(seasons[s]);    // вывод массива
        }
        System.out.println(Arrays.toString(seasons));    // вывод массива в строку
        System.out.println(Arrays.binarySearch(seasons, "Summer"));    // вывод 2 (String[2])

        int[] array = new int[10];
        Random rand = new Random();
        for (int g = 0; g < 10; g++) {
            array[g] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String s = "";
        long st = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            s += Character.getName(j);
        }
        long end = System.currentTimeMillis();
        System.err.println(s);
        System.out.println(end-st);

        StringBuilder sb = new StringBuilder();
        st = System.currentTimeMillis();
        for (int j = 0; j < 1000; j++) {
            s += Character.getName(j);
        }
        end = System.currentTimeMillis();
        //System.err.println(s);
        System.out.println(end-st); 
        sb.append("123");   // добавляем 123
        System.out.println(sb);
        sb.reverse();   // переворачиваем 123
        System.out.println(sb);
        sb.insert(1, "twer");   // вставляем twer после заданного значения
        System.out.println(sb);
        s = sb.toString();
    }
}
