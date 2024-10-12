package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF"), VIOLET("#7f00ff");
    private static final int NUMBER_COlORS = 3;
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public static FlowerColor chooseColor(int n){
        if (n < 0 || n >= NUMBER_COlORS) {
            throw new IllegalArgumentException("Invalid color number");
        }
        return switch (n % NUMBER_COlORS) {
            case 0 -> RED;
            case 1 -> BLUE;
            default -> VIOLET;
        };
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
