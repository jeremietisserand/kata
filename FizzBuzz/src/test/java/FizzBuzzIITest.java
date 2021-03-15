import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzIITest {

    @Test
    void shouldOneBeOne() {
        assertThat(FizzBuzzII.get(1)).isEqualTo("1");
    }

    @Test
    void shouldTwoBeTwo() {
        assertThat(FizzBuzzII.get(2)).isEqualTo("2");
    }

    @Test
    void shouldThreeBeFizz() {
        assertThat(FizzBuzzII.get(3)).isEqualTo("fizz");
    }

    @Test
    void shouldFiveBeBuzz() {
        assertThat(FizzBuzzII.get(5)).isEqualTo("buzz");
    }

    @Test
    void shouldFifteenBeFizzBuzz() {
        assertThat(FizzBuzzII.get(15)).isEqualTo("fizzbuzz");
    }
}
