public class RomanNumerals {

    public static final String ROMAN_UNIT = "I";
    public static final String ROMAN_TEN = "X";
    public static final String ROMAN_FORTY = "XL";
    public static final String ROMAN_FIFTY = "L";
    public static final String ROMAN_NINETY = "XC";
    public static final String ROMAN_ONE_HUNDRED = "C";

    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Il faut un nombre entier");
            return;
        }
        try {
            System.out.println(args[0] + " ==> " + convert(Integer.parseInt(args[0])));
        } catch (NumberFormatException e) {
            System.out.println(args[0] + " n'est pas un nombre entier");
        }
    }

    public static String convert(int numeral) {
        return new NumeralWrapper(numeral).convert();
    }

    private static class NumeralWrapper {

        private final int numeral;

        public NumeralWrapper(int numeral) {
            this.numeral = numeral;
        }

        String convert() {
            if (numeral <= 0) {
                return "";
            }
            if (numeral >= 100) {
                return ROMAN_ONE_HUNDRED + new NumeralWrapper(numeral - 100).convert();
            }
            if (numeral >= 90) {
                return ROMAN_NINETY + new NumeralWrapper(numeral - 90).convert();
            }
            if (numeral >= 50) {
                return ROMAN_FIFTY + new NumeralWrapper(numeral - 50).convert();
            }
            if (numeral >= 40) {
                return ROMAN_FORTY + new NumeralWrapper(numeral - 40).convert();
            }
            if (numeral >= 10) {
                return ROMAN_TEN + new NumeralWrapper(numeral - 10).convert();
            }
            return convertNumberUpToTen();
        }

        private String convertNumberUpToTen() {
            if (numeral < 4) {
                return appendRomanUnit(numeral);
            }
            if (numeral == 4) {
                return "IV";
            }
            if (numeral < 9) {
                return "V" + appendRomanUnit(numeral - 5);
            }
            if (numeral == 9) {
                return "IX";
            }
            return "";
        }

        private String appendRomanUnit(int unitNumber) {
            return ROMAN_UNIT.repeat(unitNumber);
        }

    }
}
