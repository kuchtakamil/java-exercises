package bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class BigDecimalSorter {

    public String[] stringToBigDecimal(String[] numbers) {
        Arrays.sort(numbers, 0, numbers.length,
                Collections.reverseOrder((String a, String b) -> {
                BigDecimal b1 = new BigDecimal(a);
                BigDecimal b2 = new BigDecimal(b);
                return b1.compareTo(b2);
            }
        ));
        return numbers;
    }

    public List<String> stringToBigDecimal(List<String> numbers) {
        return numbers.stream().sorted(Collections.reverseOrder((String a, String b) -> {
                            BigDecimal b1 = new BigDecimal(a);
                            BigDecimal b2 = new BigDecimal(b);
                            return b1.compareTo(b2);
                        }
                )).collect(Collectors.toList());
    }

}
