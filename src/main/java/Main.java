import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
//        m.values(w, k -> new String());


        int[] A = new int[0];
        Map<Integer, Long> integerToCount = Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Integer aLong = integerToCount.entrySet().stream().filter(e -> e.getValue() == 1).findFirst()
                .map(en -> en.getKey()).orElse(0);

    }



}
