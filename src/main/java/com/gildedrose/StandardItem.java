package com.gildedrose;

public class StandardItem extends Item {
	
	public StandardItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) throws ItemQualityOutOfRangeException {
		super(name, sellIn, quality);
	}
	
	@Override
	public void update() {
		super.decreaseSellIn();
		super.decreaseQuality(1);
	}
	
}
