import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }
        Collections.sort(list);
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(i+1)){
               count++;
            } else {
               System.out.printf("%s - ", list.get(i));
               System.out.printf("%s, ", count);
                count=1;
            }
        }
        System.out.printf("%s - ", list.get(list.size()-1));
        System.out.printf("%s.\n", count);

        Set <Integer> numbers = new TreeSet<Integer>(list);
        System.out.println(numbers);
    }
}
