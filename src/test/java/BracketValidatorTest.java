import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import parentheses.BracketValidator;

import java.util.stream.Stream;

public class BracketValidatorTest {

    @ParameterizedTest
    @MethodSource("passValidation")
    public void shouldPassValidation(String data) {
        Assertions.assertTrue(BracketValidator.validate(data));
    }

    @ParameterizedTest
    @MethodSource("failValidation")
    public void shouldFailValidation(String data) {
        Assertions.assertFalse(BracketValidator.validate(data));
    }

    private static Stream<Arguments> passValidation() {
        return Stream.of(
                Arguments.of("((){[]})"),
                Arguments.of("()"),
                Arguments.of(""),
                Arguments.of("[][]rwd[({({})})]")
        );
    }

    private static Stream<Arguments> failValidation() {
        return Stream.of(
                Arguments.of("["),
                Arguments.of(")"),
                Arguments.of("}}"),
                Arguments.of("[][{({})})]"),
                Arguments.of("[]lolo[s{({22})}a)]")
        );
    }
}
