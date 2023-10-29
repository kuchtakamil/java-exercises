package codility.prefixsums;

public class CountDiv {
    public int solution(int A, int B, int K) {

        return (B / K) - (A / K);

//        int mod = A % K;
//        if (mod != 0) {
//            A = A + (K - mod);
//        }
//        int count = 0;
//        while (A < B) {
//            A += K;
//            count++;
//        }
//
//        return count;
    }
}
