import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class YahtzeeTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    void shouldBeDiceCategory_forOneDice_withCorrespondingCategory(Category category, Dices dices) {
        int score = Yahtzee.score(category, dices);

        assertThat(score).isEqualTo(category.diceCategory);
    }

    private static Stream<Arguments> provideParameters() {
        Dices dices = Dices.of(1, 2, 3, 4, 5);
        return Stream.of(
                Arguments.of(Category.ONES_SUM, dices),
                Arguments.of(Category.TWOS_SUM, dices),
                Arguments.of(Category.THREES_SUM, dices),
                Arguments.of(Category.FOURS_SUM, dices),
                Arguments.of(Category.FIVES_SUM, dices),
                Arguments.of(Category.SIXES_SUM, Dices.of(2, 3, 4, 5, 6))
        );
    }

    @Test
    void shouldPairCategory_beSumOfPairDice_withOnePair() {
        int score = Yahtzee.score(Category.PAIR, Dices.of(1, 2, 2, 4, 5));

        assertThat(score).isEqualTo(4);
    }

    @Test
    void shouldTwoPairCategory_beSumOfTwoPairsDice_withTwoPairs() {
        int score = Yahtzee.score(Category.TWO_PAIRS, Dices.of(1, 1, 2, 2, 5));

        assertThat(score).isEqualTo(6);
    }

    @Test
    void shouldThreeOfAKindCategory_beSumOfThreeDices() {
        int score = Yahtzee.score(Category.THREE_OF_A_KIND, Dices.of(1, 1, 1, 2, 5));

        assertThat(score).isEqualTo(3);
    }

}
