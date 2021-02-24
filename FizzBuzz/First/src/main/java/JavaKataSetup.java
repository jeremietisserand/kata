public class JavaKataSetup {

    public static void main(String ...args) {;
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i + 1));
        }

    }
}
