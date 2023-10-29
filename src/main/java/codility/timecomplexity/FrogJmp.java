package codility.timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int minDistance = Y - X;
        int jumps = minDistance / D;
        return minDistance % D != 0 ? jumps + 1 : jumps;
    }
}
