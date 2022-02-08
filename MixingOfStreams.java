import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixingOfStreams {

    public static void main(String[] args) {
        Stream<String> first= Stream.of("Paladin", "Assasin", "Healer", "Bard", "Warrior");
        Stream<String> second = Stream.of("Tank", "DD", "Support", " Hybrid");
        Stream<String> result = zip(first,second);

        result.peek(System.out::println).collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> streamFirstItems = first.collect(Collectors.toList());
        List<T> streamSecondItems = second.collect(Collectors.toList());

        int minSize = Math.min(streamFirstItems.size(), streamSecondItems.size());

        List<T> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++){
            resultList.add(streamFirstItems.get(i));
            resultList.add(streamSecondItems.get(i));
        }
        return resultList.stream();
    }
}
    
