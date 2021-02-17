package com.gildedrose;

public class ItemFactory {
	
	public static Item basedOn(String rawName, int rawSellIn, int rawQuality) throws ItemQualityOutOfRangeException {
		ItemName itemName = new ItemName(rawName);
		ItemSellIn itemSellIn = new ItemSellIn(rawSellIn);
		ItemQuality itemQuality = new ItemQuality(rawQuality);
		
		if (itemName.isAgedBrie()) return new AgedBrie(itemName, itemSellIn, itemQuality);
		if (itemName.isSulfuras()) return new Sulfuras(itemName, itemSellIn, itemQuality);
		if (itemName.isBacktagePasses()) return new BackstagePasses(itemName, itemSellIn, itemQuality);
		
		return new StandardItem(itemName, itemSellIn, itemQuality);
	}
	
}
