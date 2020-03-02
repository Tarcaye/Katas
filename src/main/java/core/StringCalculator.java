package core;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public static int add(String numbers) {
        return Numbers.from(numbers).sum();
    }

}
