public class StringSum {

    public static void main(String... args) {
        System.out.println("Essai");
    }

    public int sum(String leftOperand, String rightOperand) {
        return toNatural(leftOperand) + toNatural(rightOperand);
    }

    private int toNatural(String operand) {
        if (operand.isEmpty()) {
            return 0;
        }

        try {
            return Integer.parseInt(operand);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


}
