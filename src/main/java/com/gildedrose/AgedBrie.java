package com.gildedrose;

public class AgedBrie extends Item {
	
	public AgedBrie(ItemName name, ItemSellIn sellIn, ItemQuality quality) throws ItemQualityOutOfRangeException {
		super(name, sellIn, quality);
	}
	
	@Override
	public void update() {
		super.decreaseSellIn();
		super.increaseQuality(1);
	}
}
