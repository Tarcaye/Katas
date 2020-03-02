package core;

import org.junit.jupiter.api.Test;

import static core.StringCalculator.add;
import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void return_0_when_numbers_is_empty() {
        assertThat(add("")).isEqualTo(0);
    }

    @Test
    void returns_a_single_number_otherwise() {
        assertThat(add("3")).isEqualTo(3);
    }
}
