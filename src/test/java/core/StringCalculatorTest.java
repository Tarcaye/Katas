package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    void return_0_for_an_empty_string() {
        assertThat(StringCalculator.add("")).isEqualTo(0);
    }

    @Test
    void returns_integer_value() {
        assertThat(StringCalculator.add("3")).isEqualTo(3);
    }

    @Test
    void sum_numbers_separated_by_a_space() {
        assertThat(StringCalculator.add("2 4 6 8 10 12")).isEqualTo(2+4+6+8+10+12);
    }
}
