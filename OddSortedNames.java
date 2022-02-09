import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class OddSortedNames {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("1. Oleksii");
        namesList.add("2. Dmitriy");
        namesList.add("3. George");
        namesList.add("4. Mykhailo");
        namesList.add("5. Ivan");
        namesList.add("6. Anton");
        namesList.add("7. Hlib");
        namesList.add("8 .Aleksander");
        System.out.println(namesList);


        List<String> userOddIndex = namesList
                .stream()
                .filter(user ->(Integer.parseInt(String.valueOf(user.charAt(0))))%2 != 0)
                .collect(Collectors.toList());
        System.out.println(userOddIndex);//вывожу в консоль список нечетных юзеров

        String oddUsers = userOddIndex.toString();
        String parsed = oddUsers.substring(1, oddUsers.length() -1);
        System.out.println(parsed);// вывожу в консоль строку из юзеров как сказано в ТЗ


    }
}
