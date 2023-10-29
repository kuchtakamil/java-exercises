package codility.countingelements;

public class MissingInteger {
    public int solution(int[] A) {
        int[] array = new int[1000001];
        for (int i : A) {
            if (i > 0) {
                array[i] = 1;
            }
        }
        for (int i = 1; i <= array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return 1;
    }
}
