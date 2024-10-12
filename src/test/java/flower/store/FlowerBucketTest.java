package flower.store;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testAnother() {
        flowerBucket = new FlowerBucket();
        int quantityCham = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantityTulip = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        Chamomile chamomile = new Chamomile();
        Tulip tulip = new Tulip();

        FlowerPack flowerPackRose = new FlowerPack(chamomile, quantityCham);
        FlowerPack flowerPackTulip = new FlowerPack(tulip, quantityTulip);

        flowerBucket.add(flowerPackRose);
        flowerBucket.add(flowerPackTulip);

        Assertions.assertEquals(quantityCham * chamomile.getPrice()
            + quantityTulip * tulip.getPrice(), flowerBucket.getPrice());
    }
}
