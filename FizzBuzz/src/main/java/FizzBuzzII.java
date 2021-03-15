public class FizzBuzzII {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    public static String get(int fizzBuzz) {
        if (isFizz(fizzBuzz) && isBuzz(fizzBuzz)) {
            return FIZZBUZZ;
        }
        if (isBuzz(fizzBuzz)) {
            return BUZZ;
        }
        if (isFizz(fizzBuzz)){
            return FIZZ;
        }
        return String.valueOf(fizzBuzz);
    }

    private static boolean isBuzz(int fizzBuzz) {
        return fizzBuzz % 5 == 0;
    }

    private static boolean isFizz(int fizzBuzz) {
        return fizzBuzz % 3 == 0;
    }
}
