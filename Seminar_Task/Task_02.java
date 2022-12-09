package Seminar_Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
/**
 * Task_02
 */
public class Task_02 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 129; i++) {
            String str = Character.getName(rand.nextInt(129));
            sb.append(str);           
        }
        try (FileWriter file = new FileWriter("Seminar_Task/text.txt")) {
            file.append(sb);
            file.flush();   // закрытие всех процессов
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        File file = new File("Seminar_Task/text.txt");
        file.isFile();
        file.isDirectory();
        try (FileReader reader = new FileReader(file)) {
            char[] charAr = new char[(int)file.length()];
            reader.read(charAr);
            System.out.println(Arrays.toString(charAr));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
