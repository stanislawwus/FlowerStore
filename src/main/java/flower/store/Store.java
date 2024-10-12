package flower.store;

import java.util.ArrayList;

import lombok.Getter;

public class Store {
    @Getter
    private final ArrayList<FlowerBucket> allBuckets = new ArrayList<>();

    public int search(FlowerType flowerType) {
        int quan = 0;
        for (FlowerBucket bucket : allBuckets) {
            for (FlowerPack pack : bucket.getAllFlowerPacks()) {
                if (flowerType == pack.getFlower().getFlowerType()) {
                    quan += pack.getQuantity();
                }
            }
        }
        return quan;
    }

    public void addBucket(FlowerBucket bucket) {
        allBuckets.add(bucket);
    }
}
