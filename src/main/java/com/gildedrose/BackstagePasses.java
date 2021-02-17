package com.gildedrose;

public class BackstagePasses extends Item {
	
	private static final Integer DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 10;
	private static final Integer TRIPLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 5;
	private static final Integer RESET_QUALITY_SELL_IN_THRESHOLD = 0;
	
	public BackstagePasses(ItemName name, ItemSellIn sellIn, ItemQuality quality) throws ItemQualityOutOfRangeException {
		super(name, sellIn, quality);
	}
	
	@Override
	public void update() {
		super.decreaseSellIn();
		if (super.hasToBeSoldInLessOrEqualThan(DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD))
			super.increaseQuality(2);
		else if (super.hasToBeSoldInLessOrEqualThan(TRIPLE_QUALITY_INCREASE_SELL_IN_THRESHOLD))
			super.increaseQuality(3);
		else if (super.hasToBeSoldInLessOrEqualThan(RESET_QUALITY_SELL_IN_THRESHOLD))
			super.resetQuality();
	}
	
}
