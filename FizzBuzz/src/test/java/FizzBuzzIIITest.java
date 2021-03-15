import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzIIITest {

    @Test
    void shouldOneReturnOne() {
        assertThat(FizzBuzzIII.get(1)).isEqualTo("1");
    }

    @Test
    void shouldTwoReturnTwo() {
        assertThat(FizzBuzzIII.get(2)).isEqualTo("2");
    }

    @Test
    void shouldThreeReturnFizz() {
        assertThat(FizzBuzzIII.get(3)).isEqualTo("fizz");
    }

    @Test
    void shouldFiveReturnBuzz() {
        assertThat(FizzBuzzIII.get(5)).isEqualTo("buzz");
    }

    @Test
    void shouldFifteenReturnFizzBuzzIII() {
        assertThat(FizzBuzzIII.get(15)).isEqualTo("FizzBuzzIII");
    }
}
