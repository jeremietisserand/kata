package FizzBuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";
    private final int fizzBuzz;

    private FizzBuzz(int fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    private boolean isBuzz() {
        return fizzBuzz % 5 == 0;
    }

    private boolean isFizz() {
        return fizzBuzz % 3 == 0;
    }

    public static String get(int fizzBuzz) {
        FizzBuzz fb = new FizzBuzz(fizzBuzz);
        if (fb.isFizz() && fb.isBuzz()) {
            return FIZZBUZZ;
        }

        if (fb.isFizz()) {
            return FIZZ;
        }

        if (fb.isBuzz()) {
            return BUZZ;
        }

        return String.valueOf(fizzBuzz);
    }


}
