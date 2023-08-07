package parentheses;

import java.util.Optional;

enum Bracket {
    OPEN_ROUND(Type.OPEN),
    CLOSE_ROUND(Type.CLOSE),
    OPEN_SQUARE(Type.OPEN),
    CLOSE_SQUARE(Type.CLOSE),
    OPEN_CURLY(Type.OPEN),
    CLOSE_CURLY(Type.CLOSE),
    OPEN_SHARPY(Type.OPEN),
    CLOSE_SHARPY(Type.CLOSE);

    private Type type;

    Bracket(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    static Optional<Bracket> parse(Character character) {
        return switch(character) {
            case '(' -> Optional.of(OPEN_ROUND);
            case ')' -> Optional.of(CLOSE_ROUND);
            case '[' -> Optional.of(OPEN_SQUARE);
            case ']' -> Optional.of(CLOSE_SQUARE);
            case '{' -> Optional.of(OPEN_CURLY);
            case '}' -> Optional.of(CLOSE_CURLY);
            case '<' -> Optional.of(OPEN_SHARPY);
            case '>' -> Optional.of(CLOSE_SHARPY);
            default -> Optional.empty();
        };
    }
    enum Type {
        OPEN, CLOSE
    }
}
