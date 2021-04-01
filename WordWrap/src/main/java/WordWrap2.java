public class WordWrap2 {

    public static final String COLUMN_SEPARATOR = "\n";

    public static String wrap(String input, int column) {
        if (input.length() > column) {

            return String.join(COLUMN_SEPARATOR, left(input, column), right(input, column));
        }
        return input;
    }

    private static String right(String input, int column) {
        return wrap(input.substring(column), column);
    }

    private static String left(String input, int column) {
        String leftPart = input.substring(0, column);
        if (leftPart.endsWith(" ")) {
            return removeLastSpace(leftPart);
        }
        return leftPart;
    }

    private static String removeLastSpace(String leftPart) {
        return leftPart.substring(0, leftPart.lastIndexOf(" "));
    }
}
