package flower.store;

import lombok.Getter;

@Getter
public class Chamomile extends Flower {
    private final int basePrice = 39;
    private final int baseSepalLength = 5;

    public Chamomile() {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(basePrice);
    }

    public Chamomile(double price) {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(price);
    }
}
