import binSearch.BinSearchLoop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;


public class BinSearchLoopTest {

    private List<Integer> sortedList = List.of(3, 9, 23, 42, 55, 61, 62, 77, 78, 79, 89, 133, 242, 423, 515, 3434, 535454);
    private BinSearchLoop<Integer> bsp = new BinSearchLoop<>();

    @ParameterizedTest
    @MethodSource("elementsToFindAndIndexes")
    public void findElement(int toFind, int targetIndex) {
        Assertions.assertEquals(targetIndex, bsp.search(sortedList, toFind));
    }

    @Test
    public void findElementInEmpty() {
        Assertions.assertEquals(-1, bsp.search(List.of(), 55));
    }

    private static Stream<Arguments> elementsToFindAndIndexes() {
        return Stream.of(
                Arguments.of(23, 2),
                Arguments.of(3, 0),
                Arguments.of(55, 4),
                Arguments.of(77, 7),
                Arguments.of(535454, 16),
                Arguments.of(4, -1),
                Arguments.of(333, -1)
        );
    }
}
