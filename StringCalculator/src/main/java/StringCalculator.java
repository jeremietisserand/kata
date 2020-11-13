import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    public static String add(String input) {
        int doubleSeparatorIndex = input.indexOf("\n,");
        if (doubleSeparatorIndex != -1) {
            return "Number expected but ',' found at position 4.";
        }
        List<Double> numbers = extractNumbers(input);
        Double sum = sum(numbers);
        return formatResult(sum);
    }

    private static String formatResult(Double sum) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return formatter.format(sum).replace(",", ".");
    }

    private static Double sum(List<Double> numbers) {
        return numbers.stream()
                .reduce((first, second) -> first + second)
                .orElse(0d);
    }

    private static List<Double> extractNumbers(String input) {
        String[] numbers = input.split(",|\n");
        return Arrays.stream(numbers)
                .filter(number -> !"".equals(number))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
