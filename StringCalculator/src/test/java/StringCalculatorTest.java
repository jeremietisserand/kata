import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void givenEmptyString_whenAdd_thenReturnZero() {
        // GIVEN
        String input = "";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("0");
    }

    @Test
    void givenOneNumber_whenAdd_thenReturnTheNumber() {
        // GIVEN
        String input = "1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo(input);
    }

    @Test
    void givenTwoNumbers_whenAdd_thenReturnSum() {
        // GIVEN
        String input = "1,1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("2");
    }

    @Test
    void givenANumberWithoutDecimal_whenAdd_thenReturnIntegerFormat() {
        // GIVEN
        String input = "2.0";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("2");
    }

    @Test
    void givenAnotherNumberWithoutDecimal_whenAdd_thenReturnIntegerFormat() {
        // GIVEN
        String input = "3.0";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("3");
    }

    @Test
    void givenNumberWithDecimal_whenAdd_thenReturnDecimalFormat() {
        // GIVEN
        String input = "2.1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo(input);
    }

    @Test
    void givenNumbersWithDecimal_whenAdd_thenReturnDecimalSumFormat() {
        // GIVEN
        String input = "2.1,3.1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("5.2");
    }

    @Test
    void givenNumbersWithNewlineSeparator_whenAdd_thenReturnSum() {
        // GIVENs
        String input = "2.1\n3.1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("5.2");
    }

    @Test
    void givenTwoConsecutiveSeparators_whenAdd_thenReturnErrorMessage() {
        // GIVENs
        String input = "2.1\n,3.1";

        // WHEN
        String output = StringCalculator.add(input);

        // THEN
        assertThat(output).isEqualTo("Number expected but ',' found at position 4.");
    }
}

