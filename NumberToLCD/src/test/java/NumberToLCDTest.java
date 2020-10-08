import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberToLCDTest {

    public static final String ZERO = " _ \n| |\n|_|";
    public static final String ONE = "   \n  |\n  |";
    public static final String TWO = " _ \n _|\n|_ ";
    public static final String THREE = " _ \n _|\n _|";
    public static final String FOUR = "   \n|_|\n  |";
    public static final String FIVE = " _ \n|_ \n _|";
    public static final String SIX = " _ \n|_ \n|_|";
    public static final String SEVEN = " _ \n  |\n  |";
    public static final String EIGHT = " _ \n|_|\n|_|";
    public static final String NINE = " _ \n|_|\n _|";

    @Test
    void shouldNotTreatZeroOrBellow() {
        // WHEN / THEN
        assertThat(NumberToLCD.convert(-4)).isEqualTo("");
    }

    @Test
    void shouldReplaceBellowTen() {
        // WHEN / THEN
        assertConverted(0, ZERO);
        assertConverted(1, ONE);
        assertConverted(2, TWO);
        assertConverted(3, THREE);
        assertConverted(4, FOUR);
        assertConverted(5, FIVE);
        assertConverted(6, SIX);
        assertConverted(7, SEVEN);
        assertConverted(8, EIGHT);
        assertConverted(9, NINE);
    }

    @Test
    void shouldConvertUpperThanTen() {
        // WHEN

        // THEN
        assertConverted(12,
                "     _ " + "\n" +
                "  |  _|" + "\n" +
                "  | |_ ");
    }

    private void assertConverted(int number, String expected) {
        String converted = NumberToLCD.convert(number);
        System.out.println(converted);
        assertThat(converted).isEqualTo(expected);
    }


}