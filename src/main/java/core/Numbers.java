package core;

class Numbers {
    private final String value;

    Numbers(String numbers) {
        value = numbers;
    }

    int sum() {

        if (value.isEmpty()){
            return 0;
        }

        return Integer.parseInt(value);

    }

}
