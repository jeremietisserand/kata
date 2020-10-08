import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringSumTest {

    @Test
    void shouldReplaceEmptyOperandsByZero() {
        // WHEN
        int result = new StringSum().sum("","");

        // THEN
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldBeEqualToLeftOperandWhenRightOperandIsZero() {
        // WHEN
        int result = new StringSum().sum("14","");

        // THEN
        assertThat(result).isEqualTo(14);
    }

    @Test
    void shouldBeEqualToRightOperandWhenRightOperandIsZero() {
        // WHEN
        int result = new StringSum().sum("","13");

        // THEN
        assertThat(result).isEqualTo(13);
    }

    @Test
    void shouldComputeSum() {
        // WHEN
        int result = new StringSum().sum("14","13");

        // THEN
        assertThat(result).isEqualTo(27);
    }

    @Test
    void shouldReplaceNonNaturalNumbersByZero() {
        // WHEN
        int result = new StringSum().sum("14.4","13");

        // THEN
        assertThat(result).isEqualTo(13);
    }

    @Test
    void shouldReplaceTextByZero() {
        // WHEN
        int result = new StringSum().sum("14","test");

        // THEN
        assertThat(result).isEqualTo(14);
    }
}
