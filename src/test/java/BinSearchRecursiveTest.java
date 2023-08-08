import binSearch.BinSearchRecursive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BinSearchRecursiveTest {

    private List<Integer> sortedList = List.of(3, 9, 23, 42, 55, 61, 62, 77, 78, 79, 89, 133, 242, 423, 515, 3434, 535454);

    @ParameterizedTest
    @MethodSource("elementsToFindAndIndexes")
    public void findElement(int toFind, Optional<Integer> targetIndex) {
        Assertions.assertEquals(targetIndex, BinSearchRecursive.search(sortedList, toFind));
    }

    @Test
    public void findElementInEmpty() {
        Assertions.assertEquals(Optional.empty(), BinSearchRecursive.search(List.of(), 55));
    }

    private static Stream<Arguments> elementsToFindAndIndexes() {
        return Stream.of(
                Arguments.of(23, Optional.of(2)),
                Arguments.of(3, Optional.of(0)),
                Arguments.of(55, Optional.of(4)),
                Arguments.of(77, Optional.of(7)),
                Arguments.of(535454, Optional.of(16)),
                Arguments.of(4, Optional.empty()),
                Arguments.of(333, Optional.empty())
        );
    }
}
