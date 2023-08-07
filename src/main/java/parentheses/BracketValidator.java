package parentheses;

import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BracketValidator {

    public static boolean validate(String data) {
        final List<Character> characters = data.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        final List<Bracket> brackets = characters.stream()
                .map(c -> Bracket.parse(c))
                .flatMap(Optional::stream) // skips Optional.empty() and gets Optional content
//                .flatMap(optional -> optional.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());
//                .map(c -> Bracket.parse(c))
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .collect(Collectors.toList());

        Stack<Bracket> bracketsStack = new Stack<>();
        for (Bracket bracket : brackets) {
            if (bracket.getType().equals(Bracket.Type.OPEN)) {
                bracketsStack.push(bracket);
            } else {
                if (bracketsStack.isEmpty())
                    return false;
                final Optional<Bracket> matchedCloseBracket = matchClose(bracket);
                if (matchedCloseBracket.isPresent() && !matchedCloseBracket.get().equals(bracketsStack.pop())) {
                    return false;
                }
            }
        }

        return bracketsStack.isEmpty() ? true : false;
    }

    private static Optional<Bracket> matchClose(Bracket closeBracket) {
        return switch(closeBracket) {
            case CLOSE_ROUND -> Optional.of(Bracket.OPEN_ROUND);
            case CLOSE_SQUARE -> Optional.of(Bracket.OPEN_SQUARE);
            case CLOSE_CURLY -> Optional.of(Bracket.OPEN_CURLY);
            case CLOSE_SHARPY -> Optional.of(Bracket.OPEN_SHARPY);
            default -> Optional.empty();
        };
    }

}
