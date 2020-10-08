public class WordWrap {

    public static void main(String... args) {
        System.out.println("Essai");
    }

    public static String wrap(String content, int columnSize) {
        if (content.length() <= columnSize) {
            return content;
        }
        String leftPart = content.substring(0, columnSize);
        String rightPart = content.substring(columnSize);

        int lastSpace = content.substring(0, columnSize + 1).lastIndexOf(" ");
        if (lastSpace != -1) {
            leftPart = content.substring(0, lastSpace);
            rightPart = content.substring(lastSpace + 1);
        }
        return leftPart + "\n" + wrap(rightPart, columnSize);
    }

    private class Text {
        private String leftPart;
        private String rightPart;

        public Text(String leftPart, String rightPart) {
            this.leftPart = leftPart;
            this.rightPart = rightPart;
        }

        public String getLeftPart() {
            return leftPart;
        }

        public String getRightPart() {
            return rightPart;
        }

        @Override
        public String toString() {
            return leftPart + "\n" + rightPart;
        }
    }
}
