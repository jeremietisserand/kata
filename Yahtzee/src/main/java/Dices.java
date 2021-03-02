import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dices {

    private final List<Integer> dices;

    private Dices(List<Integer> dices) {
        this.dices = dices;
    }

    public static Dices of(Integer... dices) {
        return new Dices(Arrays.asList(dices.clone()));
    }

    int sumDices(int diceSum) {
        return dices.stream()
                .filter(diceFace -> diceFace.equals(diceSum))
                .reduce(Integer::sum)
                .orElse(0);
    }

    public int pair() {
        return highestPair()
                .map(this::computePair).orElse(0);
    }

    private Optional<Integer> highestPair() {
        return getPairs()
                .map(Map.Entry::getKey)
                .map(Integer::valueOf)
                .max(Integer::compareTo);
    }

    public int twoPairs() {
        if(doesNotHaveTwoPairs()) {
            return 0;
        }
        return pairsSum();
    }

    private Integer pairsSum() {
        return getPairs()
                .map(pair -> Integer.valueOf(pair.getKey()))
                .reduce((firstPair, secondPair) -> computePair(firstPair) + computePair(secondPair))
                .get();
    }

    private boolean doesNotHaveTwoPairs() {
        return getPairs().count() != 2;
    }

    private Stream<Map.Entry<String, List<Integer>>> getPairs() {
        return groupedDices().entrySet().stream()
                .filter(diceGroup -> diceGroup.getValue().size() == 2);
    }

    private int computePair(Integer firstPair) {
        return firstPair * 2;
    }

    public int threeOfAKind() {
        if(doesNotHaveKind()) {
            return 0;
        }
        return groupedDices().entrySet().stream()
                .filter(groups -> groups.getValue().size() == 3)
                .findFirst()
                .map(dices -> Integer.parseInt(dices.getKey()))
                .map(dice -> dice * 3)
                .get();
    }

    private boolean doesNotHaveKind() {
        return groupedDices().entrySet().stream()
                .noneMatch(groups -> groups.getValue().size() == 3);
    }

    private Map<String, List<Integer>> groupedDices() {
        return dices.stream()
                .collect(Collectors.groupingBy(Object::toString));
    }
}
