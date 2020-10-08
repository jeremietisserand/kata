class DigitalDisplay {
    private final String firtLine;
    private final String secondLine;
    private final String thirdLine;

    private DigitalDisplay(DigitalDisplayBuilder builder) {
        this.firtLine = builder.firstLine;
        this.secondLine = builder.secondLine;
        this.thirdLine = builder.thirdLine;
    }

    public static DigitalDisplayBuilder builder() {
        return new DigitalDisplayBuilder();
    }

    public String display(String breakSeparator) {
        return this.firtLine + breakSeparator +
                this.secondLine + breakSeparator +
                this.thirdLine;
    }

    public static class DigitalDisplayBuilder {
        private String firstLine;
        private String secondLine;
        private String thirdLine;

        public DigitalDisplayBuilder firstLine(String firstLine) {
            this.firstLine = firstLine;
            return this;
        }

        public DigitalDisplayBuilder secondLine(String secondLine) {
            this.secondLine = secondLine;
            return this;
        }

        public DigitalDisplayBuilder thirdLine(String thirdLine) {
            this.thirdLine = thirdLine;
            return this;
        }

        public DigitalDisplay build() {
            return new DigitalDisplay(this);
        }

    }
}