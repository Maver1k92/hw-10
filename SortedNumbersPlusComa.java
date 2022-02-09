import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class SortedNumbersPlusComa {
   private static String[]numbers = {"1, 2, 0", "4, 5"};// Массив чисел из строк который дан по условию


    public static void main(String[] args) {
        // создаю лямбду строку с конвертацией строки в интеджер и возвращением строки цифр разделенных запятой
        String result =  getNumbers(numbers).stream()
                .map(element ->  (List<String>) new ArrayList<String>(Arrays.asList(element
                        .replaceAll("\\D+", " ").split(" "))))// 1) заменяю все ","  на " "; 2) разделяю  элементы по пробелу
                .flatMap(Collection::stream)
                .mapToInt(it-> Integer.parseInt(it))//
                .sorted()//
                .mapToObj(x-> x + "")
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(result);// вывожу в консоль строку отсортированых чисел через запятую
    }


    //метод для конвертации Массива в Лист
    private static List<String> getNumbers(String[] numbers) {
        List<String> result;//
        result = Arrays.asList(numbers);
        return result;
    }
}
