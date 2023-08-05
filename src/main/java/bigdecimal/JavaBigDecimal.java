package bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class JavaBigDecimal {
    public static void main(String[] args) {
        // Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] s = new String[n + 2];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.next();
//        }
//        sc.close();

        var numbers = List.of("0.12", ".12", "-100", "50", "0", "56.6", "90").stream().toArray(String[]::new);

        // Write your code here
        Arrays.sort(numbers, 0, numbers.length, Collections.reverseOrder(new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);
                return b1.compareTo(b2);

            }
        }));

        // Output
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
