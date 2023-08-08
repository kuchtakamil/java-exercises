package binSearch;

import java.util.List;

public class BinSearchLoop {

    public static int search(List<Integer> sortedList, int toFind) {
        int left = 0;
        int right = sortedList.size() - 1;

        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (sortedList.get(middle).equals(toFind)) {
                return middle;
            } else if (sortedList.get(middle) < toFind) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
