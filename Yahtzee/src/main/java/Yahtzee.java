public class Yahtzee {

    public static int score(Category category, Dices dices) {
        if (Category.PAIR == category) {
            return dices.pair();
        }
        if (Category.TWO_PAIRS == category) {
            return dices.twoPairs();
        }
        if (Category.THREE_OF_A_KIND == category) {
            return dices.threeOfAKind();
        }
        return dices.sumDices(category.diceCategory);
    }
}
