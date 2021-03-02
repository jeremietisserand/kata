public enum Category {
    ONES_SUM(1),
    TWOS_SUM(2),
    THREES_SUM(3),
    FOURS_SUM(4),
    FIVES_SUM(5),
    SIXES_SUM(6),
    PAIR(0),
    TWO_PAIRS(0),
    THREE_OF_A_KIND(0);

    public int diceCategory;

    Category(int diceCategory) {
        this.diceCategory = diceCategory;
    }

}
