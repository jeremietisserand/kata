import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    void shouldOneReturnOne() {
        assertThat(FizzBuzz.get(1)).isEqualTo("1");
    }

    @Test
    void shouldTwoReturnTwo() {
        assertThat(FizzBuzz.get(2)).isEqualTo("2");
    }

    @Test
    void shouldThreeReturnFizz() {
        assertThat(FizzBuzz.get(3)).isEqualTo("fizz");
    }

    @Test
    void shouldFiveReturnBuzz() {
        assertThat(FizzBuzz.get(5)).isEqualTo("buzz");
    }

    @Test
    void shouldFifteenReturnFizzbuzz() {
        assertThat(FizzBuzz.get(15)).isEqualTo("fizzbuzz");
    }
}
