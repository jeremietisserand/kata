public class TennisKata {

    private final String playerTwoName;
    private final String playerOneName;

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public TennisKata(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public static void main(String... args) {
        System.out.println("Essai");
    }


    public String getScore() {
        if(hasWinner()) {
            return getHighestPlayerName() + " wins";
        }
        if(isDeuce()) {
            return "Deuce";
        }
        if(hasAdvantage()) {
            return getHighestPlayerName() + " advantage";
        }
        if(playerOneScore == playerTwoScore) {
            return getTranslatedScore(playerOneScore) + " all";
        }
        return getPlayerOneScore(playerOneName) + ", " + getPlayerTwoScore(playerTwoName);
    }

    private boolean isDeuce() {
        return playerOneScore >=3 && playerOneScore == playerTwoScore;
    }

    private boolean hasAdvantage() {
        return playerOneScore >=3 && onePlayerHaveAdvantage();
    }

    private boolean hasWinner() {
        return oneScoreUpperToForty() && onePlayerWins();
    }

    private boolean onePlayerWins() {
        return Math.abs(playerOneScore - playerTwoScore) >= 2;
    }

    private boolean oneScoreUpperToForty() {
        return playerOneScore > 3 || playerTwoScore > 3;
    }

    private boolean onePlayerHaveAdvantage() {
        return Math.abs(playerOneScore - playerTwoScore) == 1;
    }
    private String getHighestPlayerName() {
        if(playerOneScore > playerTwoScore){
            return playerOneName;
        }
        return playerTwoName;
    }

    private String getPlayerOneScore(String playerOneName) {
        return getPlayerScore(playerOneName, getTranslatedScore(playerOneScore));
    }

    private String getPlayerTwoScore(String playerTwoName) {
        return getPlayerScore(playerTwoName, getTranslatedScore(playerTwoScore));
    }

    private String getPlayerScore(String playerOneName, String score) {
        return playerOneName + ": " + score;
    }

    private String getTranslatedScore(int scoreNumber) {
        if (scoreNumber == 1) {
            return "Fifteen";
        }
        if (scoreNumber == 2) {
            return "Thirty";
        }
        if (scoreNumber == 3) {
            return "Forty";
        }
        return "Love";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
