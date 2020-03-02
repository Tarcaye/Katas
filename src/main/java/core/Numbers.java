package core;

import static java.lang.Integer.parseInt;

public class Numbers {
    private final String value;

    public Numbers(String numbers) {
        value = numbers;
    }

    int sum() {
        if (value.contains(" ")) {
            String[] strings = value.split(" ");
            return parseInt(strings[0]) + parseInt(strings[1]);
        }
        if (value.isEmpty()) {
            return 0;
        }
        return parseInt(value);
    }

}
