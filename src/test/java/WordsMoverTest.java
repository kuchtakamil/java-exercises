import movingWords.WordsMover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsMoverTest {

    @Test
    public void moveFor11() {
        final String res = WordsMover.splitLongWords("Lorem ipsum dolor sit amet consectetur", 11);
        assertEquals("Lorem ipsum\ndolor sit a-\nmet consect-\netur", res);
    }
}
