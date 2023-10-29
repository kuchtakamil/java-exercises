package codility.iterations;

public class Iterations {

    public int solution(int N) {

        String binary = Integer.toBinaryString(N);

        int zeros = 0;
        int maximum = 0;

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                zeros++;
            } else {
                if (zeros > maximum) {
                    maximum = zeros;
                }
                zeros = 0;
            }
        }

        return maximum;
    }
}
