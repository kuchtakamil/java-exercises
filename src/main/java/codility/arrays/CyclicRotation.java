package codility.arrays;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        if (K == A.length || K == 0 || A.length == 0 || A.length == 1) {
            return A;
        }
        K = K % A.length;
        int[] tail = Arrays.copyOfRange(A, A.length - K, A.length);
        int[] head = Arrays.copyOfRange(A, 0, A.length - K);

        int[] combined = new int[head.length + tail.length];

        System.arraycopy(tail, 0, combined, 0, tail.length);
        System.arraycopy(head, 0, combined, tail.length, head.length);

        return combined;
    }
}
