package binSearch;

import java.util.List;
import java.util.Optional;

public class BinSearchRecursive {

    public static Optional<Integer> search(List<Integer> list, Integer toFind) {
        return search(list, toFind, 0, list.size() - 1);
    }

    private static Optional<Integer> search(List<Integer> list, Integer toFind, int start, int end) {
        if (start > end) {
            return Optional.empty();
        }

        int middle = Math.round((start + end) / 2);
        if (list.get(middle).equals(toFind)) {
            return Optional.of(middle);
        }

        if (list.get(middle) > toFind) {
            return search(list, toFind, start, middle - 1);
        } else {
            return search(list, toFind, middle + 1, end);
        }
    }
}
