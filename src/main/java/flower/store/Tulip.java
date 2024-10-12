package flower.store;

import lombok.Getter;

@Getter
public class Tulip extends Flower {
    private final int basePrice = 55;
    private final int baseSepalLength = 3;

    public Tulip() {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(basePrice);
    }

    public Tulip(double price) {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(price);
    }
}
