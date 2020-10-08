import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void shouldNotConvertBelowZero() {
        // WHEN
        String romanNumeral = RomanNumerals.convert(-2);

        // THEN
        assertThat(romanNumeral).isEqualTo("");
    }

    @Test
    void shouldNotConvertZero() {
        // WHEN
        String romanNumeral = RomanNumerals.convert(0);

        // THEN
        assertThat(romanNumeral).isEqualTo("");
    }

    @Test
    void shouldConvertOne() {
        // WHEN
        String romanNumeral = RomanNumerals.convert(1);

        // THEN
        assertThat(romanNumeral).isEqualTo("I");
    }

    @Test
    void shouldConvertUpToThreeWithI() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(2)).isEqualTo("II");
        assertThat(RomanNumerals.convert(3)).isEqualTo("III");
    }

    @Test
    void shouldConvertFourWithV() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(4)).isEqualTo("IV");
    }

    @Test
    void shouldConvertUpToEightWithV() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(5)).isEqualTo("V");
        assertThat(RomanNumerals.convert(6)).isEqualTo("VI");
        assertThat(RomanNumerals.convert(7)).isEqualTo("VII");
        assertThat(RomanNumerals.convert(8)).isEqualTo("VIII");
    }

    @Test
    void shouldConvertNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    void shouldConvertTen() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(10)).isEqualTo("X");
    }

    @Test
    void shouldConvertUpToNineteen() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(11)).isEqualTo("XI");
        assertThat(RomanNumerals.convert(12)).isEqualTo("XII");
        assertThat(RomanNumerals.convert(13)).isEqualTo("XIII");
        assertThat(RomanNumerals.convert(14)).isEqualTo("XIV");
        assertThat(RomanNumerals.convert(15)).isEqualTo("XV");
        assertThat(RomanNumerals.convert(19)).isEqualTo("XIX");
    }

    @Test
    void shouldConvertUpToThirtyNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(20)).isEqualTo("XX");
        assertThat(RomanNumerals.convert(21)).isEqualTo("XXI");
        assertThat(RomanNumerals.convert(24)).isEqualTo("XXIV");
        assertThat(RomanNumerals.convert(29)).isEqualTo("XXIX");
        assertThat(RomanNumerals.convert(30)).isEqualTo("XXX");
        assertThat(RomanNumerals.convert(39)).isEqualTo("XXXIX");
    }

    @Test
    void shouldConvertUpToFortyNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(40)).isEqualTo("XL");
        assertThat(RomanNumerals.convert(49)).isEqualTo("XLIX");
    }

    @Test
    void shouldConvertUpToEghtyNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(50)).isEqualTo("L");
        assertThat(RomanNumerals.convert(55)).isEqualTo("LV");
        assertThat(RomanNumerals.convert(60)).isEqualTo("LX");
        assertThat(RomanNumerals.convert(70)).isEqualTo("LXX");
        assertThat(RomanNumerals.convert(80)).isEqualTo("LXXX");
        assertThat(RomanNumerals.convert(89)).isEqualTo("LXXXIX");
    }

    @Test
    void shouldConvertUpToNinetyNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(90)).isEqualTo("XC");
        assertThat(RomanNumerals.convert(99)).isEqualTo("XCIX");
    }

    @Test
    void shouldConvertUpToThreeHundredAndNinetyNine() {
        // WHEN / THEN
        assertThat(RomanNumerals.convert(100)).isEqualTo("C");
        assertThat(RomanNumerals.convert(200)).isEqualTo("CC");
        assertThat(RomanNumerals.convert(299)).isEqualTo("CCXCIX");
        assertThat(RomanNumerals.convert(300)).isEqualTo("CCC");
        assertThat(RomanNumerals.convert(399)).isEqualTo("CCCXCIX");
    }
}