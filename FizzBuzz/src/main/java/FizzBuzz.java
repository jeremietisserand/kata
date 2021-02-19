public class FizzBuzz {

    public String fizzBuzz(int input) {
        if (input % (3 * 5) == 0) {
            return "fizzbuzz";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if (input % 5 == 0) {
            return "buzz";
        }
        return Integer.toString(input);
    }
}
