package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        // Tworzenie IntStream z tablicy liczb całkowitych
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = Arrays.stream(numbers);

        // Wyświetlanie wszystkich liczb w strumieniu
        intStream.forEach(System.out::println);

        // Tworzenie IntStream za pomocą range
        IntStream.range(1, 6)
                .forEach(System.out::println);

        // Przykład operacji map / mapToLong
        int sum = Arrays.stream(numbers)
                .map(x -> x * 2)
                .sum();

//        IntStream stream = Arrays.stream(numbers);
        long sumLong = Arrays.stream(numbers)
                .mapToLong(x -> x * 2)
                .sum();

        Set<Integer> sumObj = Arrays.stream(numbers)
                .mapToObj(x -> x * 2)
                .collect(Collectors.toSet());

        Set<Integer> collect = Arrays.stream(numbers)
                .map(x -> x * 2).boxed()
                .collect(Collectors.toSet());


        // Przykład operacji filter
        IntStream evenNumbers = Arrays.stream(numbers)
                .filter(x -> x % 2 == 0);
        evenNumbers.forEach(System.out::println);

        // Przykład operacji statistics
        IntSummaryStatistics stats = Arrays.stream(numbers)
                .summaryStatistics();
        System.out.println("Statystyki: " +
                "średnia=" + stats.getAverage() +
                ", suma=" + stats.getSum() +
                ", maksimum=" + stats.getMax() +
                ", minimum=" + stats.getMin()
        );
    }
}