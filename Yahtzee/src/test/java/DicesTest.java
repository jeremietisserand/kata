import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DicesTest {

    @Test
    void shouldSumDices_beZero_whenNoDiceMatches() {
        int sum = Dices.of(2, 3, 4, 5, 5).sumDices(1);

        assertThat(sum).isEqualTo(0);
    }

    @Test
    void shouldSumDices_sumExpectedDices() {
        int sum = Dices.of(2, 2, 4, 5, 5).sumDices(2);

        assertThat(sum).isEqualTo(4);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void shouldSumDices_forOneDice_withExpectedDice(int expectedDice, Dices dices) {
        int sum = dices.sumDices(expectedDice);

        assertThat(sum).isEqualTo(expectedDice);
    }

    private static Stream<Arguments> provideParameters() {
        Dices dices = Dices.of(1, 2, 3, 4, 5);
        return Stream.of(
                Arguments.of(1, dices),
                Arguments.of(2, dices),
                Arguments.of(3, dices),
                Arguments.of(4, dices),
                Arguments.of(5, dices),
                Arguments.of(6, Dices.of(2, 3, 4, 5, 6))
        );
    }

    @Test
    void shouldSumPair_bePairSum_withOnePair() {
        int score = Dices.of(1, 2, 2, 4, 5).pair();

        assertThat(score).isEqualTo(4);
    }

    @Test
    void shouldSumPair_beZero_withoutPair() {
        int score = Dices.of(1, 2, 3, 4, 5).pair();

        assertThat(score).isEqualTo(0);
    }

    @Test
    void shouldSumPair_beSumOfHighestDice_withTwoPairs() {
        int score = Dices.of(1, 1, 2, 2, 5).pair();

        assertThat(score).isEqualTo(4);
    }

    @Test
    void shouldTwoPair_beZero_withoutPairs() {
        int score = Dices.of(1, 2, 3, 4, 5).twoPairs();

        assertThat(score).isEqualTo(0);
    }

    @Test
    void shouldTwoPair_beSumOfPairs_withPairs() {
        int score = Dices.of(1, 2, 2, 4, 4).twoPairs();

        assertThat(score).isEqualTo(12);
    }

    @Test
    void shouldThreeOfAKind_beZero_withoutThree() {
        int score = Dices.of(1, 2, 2, 4, 4).threeOfAKind();

        assertThat(score).isEqualTo(0);
    }

    @Test
    void shouldThreeOfAKind_beSum_withThreeSameDices() {
        int score = Dices.of(1, 2, 2, 2, 5).threeOfAKind();

        assertThat(score).isEqualTo(6);
    }
}
