package flower.store;


import lombok.Getter;

@Getter
public class Rose extends Flower {

    private final int basePrice = 99;
    private final int baseSepalLength = 4;

    public Rose() {
        this.setFlowerType(FlowerType.ROSE);
        this.setSepalLength(baseSepalLength);
        this.setPrice(basePrice);
        this.setColor(FlowerColor.RED);
    }

    public Rose(double price) {
        this.setFlowerType(FlowerType.ROSE);
        this.setSepalLength(baseSepalLength);
        this.setPrice(price);
        this.setColor(FlowerColor.RED);
    }
}