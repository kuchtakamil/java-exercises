package cols;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringToChars {
    public static void main(String[] args) {
        String str = "2457";
//        String -> List<Char>, List<String>
        // TS:
//        List<Character> chars = Arrays.asList(str.toCharArray());
        List<Character> chars =  str.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        List<String> symbols =  str.chars().mapToObj(i -> Character.toString(i)).collect(Collectors.toList());
        Collections.reverse(symbols);
        String s = symbols.get(0);
        System.out.println(symbols);

//        Integer[] -> List<Integer>
        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        List<Integer> targetList = Arrays.asList(sourceArray);
        Integer[] integerArray = targetList.toArray(new Integer[0]);

//        int[] -> List<Integer>
        int[] sourceArraySmall = { 0, 1, 2, 3, 4, 5 };
//        final IntStream stream = Arrays.stream(sourceArraySmall);
        Integer[] boxedArray = Arrays.stream(sourceArraySmall).boxed().toArray(Integer[]::new);
        List<Integer> listFromArray = Arrays.asList(boxedArray);

    }
}
