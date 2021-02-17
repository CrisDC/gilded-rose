package com.gildedrose;

public class Sulfuras extends Item {
	
	private static final ItemQuality LEGENDARY_QUALITY = new ItemQuality(80);
	
	public Sulfuras(ItemName name, ItemSellIn sellIn, ItemQuality quality) throws ItemQualityOutOfRangeException {
		if (!LEGENDARY_QUALITY.equals(quality))
			throw new ItemQualityOutOfRangeException(name.getValue(), quality.getValue());
		super.name = name;
		super.sellIn = sellIn;
		super.quality = quality;
	}
	
	@Override
	public void update() {
		super.decreaseSellIn();
	}
	
}
