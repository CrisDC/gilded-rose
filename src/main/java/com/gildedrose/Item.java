package com.gildedrose;

public abstract class Item {
    
    private static final ItemQuality MAX_QUALITY = new ItemQuality(50);
    private static final ItemQuality MIN_QUALITY = new ItemQuality(0);

    public ItemName name;

    public ItemSellIn sellIn;

    public ItemQuality quality;
    
    public Item() {}

    public Item(ItemName name, ItemSellIn sellIn, ItemQuality quality) throws ItemQualityOutOfRangeException {
        if(MIN_QUALITY.compareTo(quality) < 0 || MAX_QUALITY.compareTo(quality) > 0)
            throw new ItemQualityOutOfRangeException(name.getValue(), quality.getValue());
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    
    public ItemName getName() {
        return name;
    }
    
    public ItemSellIn getSellIn() {
        return sellIn;
    }
    
    public ItemQuality getQuality() {
        return quality;
    }
    
    public void increaseQuality(Integer num) {
        this.quality.increase(num);
    }
    
    public void decreaseQuality(Integer num) {
        this.quality.decrease(num);
    }
    
    public void resetQuality() {
        this.quality.reset();
    }
    
    public void decreaseSellIn() {
        this.sellIn.decrease();
    }
    
    public boolean hasToBeSoldInLessOrEqualThan(Integer days) {
        return sellIn.isLessOrEqualThan(days);
    }
    
    public abstract void update();

    @Override
    public String toString() {
        return this.name.getValue() + ", " + this.sellIn.getValue() + ", " + this.quality.getValue();
    }
}
