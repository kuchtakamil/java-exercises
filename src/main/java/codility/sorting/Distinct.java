package codility.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Distinct {
    public int solution(int[] A) {
        return Arrays.stream(A)
                .boxed()
                .collect(Collectors.toSet()).size();
    }
}
