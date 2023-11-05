package HomeworkNr12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(number -> number % 2 != 0),
    CHECK_IF_EVEN(number -> number % 2 == 0),
    CHECK_IF_NEGATIVE(number -> number < 0),
    CHECK_IF_POSITIVE(number -> number > 0);

    private final Predicate<Integer> predicate;

    CheckInteger(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    public boolean test(Integer number) {
        return predicate.test(number);
    }
}
