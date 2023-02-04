import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 * Каталог товаров книжного магазина сохранен в виде двумерного списка
 * List<ArrayList<String>> так,
 * что на 0й позиции каждого внутреннего списка содержится название жанра, а на
 * остальных позициях -
 * названия книг. Напишите метод для заполнения данной структуры.
 */

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"cp866");
        System.out.print("Введите жанр: ");
        String genre = iScanner.nextLine();
        System.out.print("Введите название книги: ");
        String book = iScanner.nextLine();
        System.out.print("Введите жанр: ");
        String genre2 = iScanner.nextLine();
        System.out.print("Введите название книги: ");
        String book2 = iScanner.nextLine();
        ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add(genre);
        list.add(book);
        list.add(genre2);
        list.add(book2);
        System.out.println(list);
        matrix.add(list);
        System.out.println(matrix);
        iScanner.close();
    }
}