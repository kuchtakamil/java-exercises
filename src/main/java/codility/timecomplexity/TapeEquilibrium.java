package codility.timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }

        int leftSum = 0;
        int rightSum = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < A.length -1; i++) {
            leftSum += A[i];
            rightSum = sum - leftSum;
            int currentDifference = Math.abs(leftSum - rightSum);
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }
        }
        return minDifference;
    }
}
