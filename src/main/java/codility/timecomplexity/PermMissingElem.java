package codility.timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        int N = A.length;

        int expectedSum = (N + 1) * (N + 2) / 2;

        int actualSum = 0;
        for (int num : A) {
            actualSum += num;
        }

        int missingElement = expectedSum - actualSum;

        return missingElement;
    }
}
