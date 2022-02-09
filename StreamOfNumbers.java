import java.util.stream.Stream;

public class StreamOfNumbers {

    public static void main(String[] args) {
        Stream<Long> result = randomaizerOfNumbers(25214903917L,11L,(long) Math.pow(2,48),0);
        result.forEach(System.out::println);// проверка того что генерю
    }

    //создание метода который возвращает стрим лонгов и принимает a,c,m, seed;
    public static Stream<Long> randomaizerOfNumbers(long a, long c, long m, long seed ){
       return Stream.iterate(seed,x -> (((a * x) + c) % m));
              // .limit(10);// для проверки того что генерю раскоментить и убрать ;  в 12 строке
    }
}
