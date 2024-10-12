package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Rose extends Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    @Override
    public String toString() {
        return "Rose{"
                + "sepalLength=" + sepalLength
                + ", color=" + color
                + ", price=" + price
                + '}';
    }
}