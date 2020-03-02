package core;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Numbers {
    private final Collection<Integer> values;

    private Numbers(Collection<Integer> francky) {
        values = francky;
    }

    public static Numbers from(String numberToParse) {
        return new Numbers(parseNumbers(numberToParse));
    }

    // TODO: 2020-03-02 Move ??  
    private static Collection<Integer> parseNumbers(String numberToParse) {
        Collection<Integer> result;
        if (numberToParse.contains(" ")) {
            String[] strings = numberToParse.split(" ");
            result = Stream.of(strings)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } else if (numberToParse.isEmpty()) {
            result = Collections.emptyList();
        } else {
            result = Collections.singleton(parseInt(numberToParse));
        }
        return result;
    }

    int sum() {
        return values.stream()
                .reduce(0, Integer::sum);
    }

}
