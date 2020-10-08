import jdk.swing.interop.DispatcherWrapper;

import java.util.Map;

public class NumberToLCD {

    public static final String BREAK = System.lineSeparator();

    public static final Map<Integer, DigitalDisplay.DigitalDisplayBuilder> lcdMap = Map.of(
            0, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("| |")
                    .thirdLine("|_|"),
            1, DigitalDisplay.builder()
                    .firstLine("   ")
                    .secondLine("  |")
                    .thirdLine("  |"),
            2, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine(" _|")
                    .thirdLine("|_ "),
            3, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine(" _|")
                    .thirdLine(" _|"),
            4, DigitalDisplay.builder()
                    .firstLine("   ")
                    .secondLine("|_|")
                    .thirdLine("  |"),
            5, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("|_ ")
                    .thirdLine(" _|"),
            6, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("|_ ")
                    .thirdLine("|_|"),
            7, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("  |")
                    .thirdLine("  |"),
            8, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("|_|")
                    .thirdLine("|_|"),
            9, DigitalDisplay.builder()
                    .firstLine(" _ ")
                    .secondLine("|_|")
                    .thirdLine(" _|"));

    public static void main(String... args) {
        System.out.println("Essai");
    }

    public static String convert(int number) {
        DigitalDisplay.DigitalDisplayBuilder builder = null;
        if (number < 0) {
            return "";
        }
        if (number < 10) {
            builder = lcdMap.get(number);
        }
        return builder.build().display(BREAK);
//        return convert(number % 10) + convert(number - (number % 10) * 10);
    }


}

