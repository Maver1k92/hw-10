import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

public class ReverceNamesInUpper {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Oleksii");
        namesList.add("Dmitriy");
        namesList.add("George");
        namesList.add("Mykhailo");
        namesList.add("Ivan");
        namesList.add("Anton");
        namesList.add("Hlib");
        namesList.add("Aleksander");
        namesList.add("Ysyf");
        System.out.println(namesList);//Вывожу список имен для проверки что у меня в списке


        List<String> reverceUserNames = namesList
                .stream()
                .map(String:: toUpperCase)//Преобразовую в верхний регистр
                .sorted(reverseOrder())// Разворачиваю в обратном порядке
                .collect(Collectors.toList());
        System.out.println(reverceUserNames);// Вывожу список имен в обратном порядке




    }


}

