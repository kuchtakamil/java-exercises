package codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDivTest {

    CountDiv countDiv = new CountDiv();

    @Test
    public void shouldWorks() {
        int res = countDiv.solution(23, 288, 7);
        Assertions.assertEquals(38, res);
    }

    @Test
    public void shouldWorks2() {
        int res = countDiv.solution(20, 288, 7);
        Assertions.assertEquals(39, res);
    }
    @Test
    public void shouldWorks3() {
        int res = countDiv.solution(6, 11, 2);
        Assertions.assertEquals(3, res);
    }
}
