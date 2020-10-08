import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisKataTest {

    private TennisKata tennisKata;

    @BeforeEach
    void initGame() {
        tennisKata = new TennisKata("Player 1", "Player 2");
    }

    @Test
    void shouldLoveAll() {
        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Love all");
    }

    @Test
    void shouldFifteenAll() {
        // WHEN
        createScore(1, 1);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Fifteen all");
    }

    @Test
    void shouldThirtyAll() {
        // WHEN
        createScore(2, 2);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Thirty all");
    }

    @Test
    void shouldDeuce() {
        // WHEN
        createScore(3, 3);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Deuce");
    }

    @Test
    void shouldPlayerOneAdvantagesWhenScoresAtForty() {
        // WHEN
        createScore(4, 3);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1 advantage");
    }

    @Test
    void shouldPlayerTwoAdvantagesWhenScoresAtForty() {
        // WHEN
        createScore(3, 4);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 2 advantage");
    }

    @Test
    void shouldPlayerBeDeuceAtScoreEquality() {
        // WHEN
        createScore(5, 5);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Deuce");
    }

    @Test
    void shouldAdvantagePlayerOneWinsGame() {
        // WHEN
        createScore(6, 4);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1 wins");
    }

    @Test
    void shouldAdvantagePlayerTwoWinsGame() {
        // WHEN
        createScore(4, 6);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 2 wins");
    }

    @Test
    void shouldPlayerOneScoresAtLove() {
        // WHEN
        createScore(1, 0);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1: Fifteen, Player 2: Love");
    }

    @Test
    void shouldPlayerOneScoresAtFifteen() {
        // WHEN
        createScore(2, 0);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1: Thirty, Player 2: Love");
    }

    @Test
    void shouldPlayerOneScoresAtThirty() {
        // WHEN
        createScore(3, 0);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1: Forty, Player 2: Love");
    }

    @Test
    void shouldPlayerOneWins(){
        // WHEN
        createScore(4, 0);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 1 wins");
    }

    @Test
    void shouldPlayerTwoWins(){
        // WHEN
        createScore(2, 4);

        // THEN
        assertThat(tennisKata.getScore()).isEqualTo("Player 2 wins");
    }

    private void createScore(int playerOneScore, int playerTwoScore) {

        for (int score = 0; score < playerOneScore; score++) {
            tennisKata.playerOneScores();
        }
        for (int score = 0; score < playerTwoScore; score++) {
            tennisKata.playerTwoScores();
        }
    }

}