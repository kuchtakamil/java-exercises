package binSearch;

import java.util.List;

public class BinSearchLoop<T extends Comparable> {

    public int search(List<T> sortedList, T toFind) {
        int left = 0;
        int right = sortedList.size() - 1;

        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (sortedList.get(middle).equals(toFind)) {
                return middle;
            } else if (sortedList.get(middle).compareTo(toFind) < 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
