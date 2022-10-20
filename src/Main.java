import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("Карл", "Клара", "украл", "кораллы", "Клара", "украл", "кларнет"));
        task4(List.of("Карл", "Клара", "украл", "кораллы", "Клара", "украл", "кларнет"));
    }

    public static void task1(List<Integer> numbers) {
        System.out.println("Задание 1");
        for (Integer num: numbers) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

    }

    public static void task2(List<Integer> numbers) {
        System.out.println("Задание 3");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer num: set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }

    public static void task3(List<String> words) {
        System.out.println("Задание 3");
        for (String word : words) {
            if (Collections.frequency(words, word) ==1) {
                System.out.println(word);
            }
        }
    }

    public static void task4(List<String> words) {
        System.out.println("Задание 4");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word + " встречается " + Collections.frequency(words,word) + " раз");
        }
    }
}