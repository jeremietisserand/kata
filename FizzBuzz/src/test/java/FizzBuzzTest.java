import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    void should_fizz_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] expected = {"1", "2", "fizz", "4", "buzz",
                "fizz", "7", "8", "fizz", "buzz",
                "11", "fizz", "13", "14", "fizzbuzz",
                "16", "17", "fizz", "19", "buzz",
                "fizz", "22", "23", "fizz", "buzz",
                "26", "fizz", "28", "29", "fizzbuzz"};

        for(int i = 0; i < expected.length; i++) {
            assertThat(fizzBuzz.fizzBuzz(i + 1)).isEqualTo(expected[i]);
        }
    }
}
