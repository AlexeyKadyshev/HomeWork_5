/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов. */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Subscribers {
    public static void main(String[] args) {
        String[] namessarr = new String[]{"Сидоров Андрей Иванович", "Иванов Петр Алексеевич",
                "Захаров Максим Леонидович", "Петров Семен Степанович", "Борисов Виталий Павлович",
                "Сидоров Андрей Иванович", "Петров Семен Степанович", "Иванов Петр Алексеевич"};
        Integer[] numbers = new Integer[]{977777333, 32345123, 123412352, 2133214215, 123124512,
                123454657, 235473743, 235325552};
        Map<Integer, String> phonehash = new HashMap<>();
        for (int i = 0; i < namessarr.length; i++) {
            phonehash.put(numbers[i], namessarr[i]);
        }
        System.out.println(phonehash);
        System.out.println("=".repeat(300));
        phonehash.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator<Integer>) (o1, o2) -> o2 - o1)).forEach(System.out::println);
    }
}