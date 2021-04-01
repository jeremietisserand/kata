import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void shouldYearDivisibleBy400_aLeapYear() {
        assertThat(LeapYear.isLeap(2000)).isEqualTo(true);
    }

    @Test
    void shouldYearDivisibleBy100_butNotBy400_areNotLeapYear() {
        assertThat(LeapYear.isLeap(1700)).isEqualTo(false);
    }

}
