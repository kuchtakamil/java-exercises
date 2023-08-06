package movingWords;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordsMover {

    private static final char EMPTY = ' ';
    private static final char MINUS = '-';
    private static final char NEW_LINE = '\n';

    public static String splitLongWords(String sentence, int lengthLimit) {
        List<Character> sentenceInChars = sentence.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        List<Character> resultSentence = new ArrayList<>(sentence.length() + sentence.length() / lengthLimit);
        lengthLimit--;
        int counter = 0;
        for (Character character : sentenceInChars) {
            if (counter == lengthLimit && sentenceInChars.get(counter) != EMPTY && sentenceInChars.get(counter + 1) != EMPTY) {
                resultSentence.add(character);
                resultSentence.add(MINUS);
                resultSentence.add(NEW_LINE);
                sentenceInChars = sentenceInChars.subList(counter + 1, sentenceInChars.size());
                counter = 0;
            } else if (character == NEW_LINE || (counter >= lengthLimit && character == EMPTY)) {
                resultSentence.add(NEW_LINE);
                sentenceInChars = sentenceInChars.subList(counter + 1, sentenceInChars.size());
                counter = 0;
            }  else {
                resultSentence.add(character);
                counter++;
            }
        }
        return resultSentence.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
