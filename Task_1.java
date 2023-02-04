
/**
 Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
