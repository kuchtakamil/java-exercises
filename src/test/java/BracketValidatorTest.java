import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import parentheses.BracketValidator;

public class BracketValidatorTest {

    @Test
    public void passValidation() {
        Assertions.assertTrue(BracketValidator.validate("((){[]})"));
    }

    @Test
    public void failValidation() {
        Assertions.assertFalse(BracketValidator.validate("(({[[]})"));
    }
}
