package core;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

class Numbers {
    private Collection<Integer> values;

    private Numbers(Collection<Integer> numbers) {
        this.values = numbers;
    }

    static Numbers from(String numbersToParse) {
        Collection<Integer> numbers;
        if (numbersToParse.isEmpty()) {
            numbers = Collections.singleton(0);
        } else if (numbersToParse.length() > 1) {
            String[] elements = numbersToParse.split(" ");
            numbers = Stream.of(elements)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } else {
            numbers = Collections.singleton(parseInt(numbersToParse));
        }
        return new Numbers(numbers);
    }

    int sum() {
        return values
                .stream()
                .reduce(0, Integer::sum);
    }

}
