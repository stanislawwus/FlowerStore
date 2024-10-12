package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"),
    BLUE("#0000FF"),
    VIOLET("#7f00ff");
    private static final int NUMBER_COLORS = 3;
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public static FlowerColor chooseColor(int n) {
        if (n < 0 || n >= NUMBER_COLORS) {
            throw new IllegalArgumentException("Invalid color number");
        }
        else if (n % NUMBER_COLORS == 0) {
            return RED;
        }
        else if (n % NUMBER_COLORS == 1) {
            return BLUE;
        }
        else {
            return VIOLET;
        }
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
