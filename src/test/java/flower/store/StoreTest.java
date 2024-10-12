
package flower.store;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 10;
    private static final int MAX_PRICE = 1000;

    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testAdd() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        for (int i = 0; i < quantity; i++) {
            FlowerBucket flowerBucket = new FlowerBucket();
            int numberPacks = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
            for (int j = 0; j < numberPacks; j++) {
                int numberFlowers = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
                flowerBucket.add(new FlowerPack(new Rose(), numberFlowers));
            }
            store.addBucket(flowerBucket);
        }
        Assertions.assertEquals(quantity, store.getAllBuckets().size());
    }

    @Test
    public void testSearch() {
        FlowerBucket flowerBucketRose = new FlowerBucket();
        FlowerBucket flowerBucketChamomile = new FlowerBucket();

        int numberPacksRose = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int priceRose = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int numberPacksChamomile = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int priceChamomile = RANDOM_GENERATOR.nextInt(MAX_PRICE);

        for (int i = 0; i < numberPacksRose; i++) {
            Rose rose = new Rose();
            rose.setPrice(priceRose);
            flowerBucketRose.add(new FlowerPack(rose, numberPacksRose));
        }

        for (int i = 0; i < numberPacksChamomile; i++) {
            Chamomile chamomile = new Chamomile();
            chamomile.setPrice(priceChamomile);
            flowerBucketChamomile.add(new FlowerPack(chamomile,
                    numberPacksChamomile));
        }

        store.addBucket(flowerBucketRose);
        store.addBucket(flowerBucketChamomile);
        int numberTulips = 0;
        int numberRoses = numberPacksRose * numberPacksRose;
        int numberChamomiles = numberPacksChamomile * numberPacksChamomile;

        Assertions.assertEquals(numberTulips, store.search(FlowerType.TULIP));
        Assertions.assertEquals(numberRoses, store.search(FlowerType.ROSE));
        Assertions.assertEquals(numberChamomiles,
                store.search(FlowerType.CHAMOMILE));
    }
}
