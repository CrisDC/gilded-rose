package com.gildedrose;

public class ItemName {
	
	private static final String AGED_BRIE = "Aged Brie";
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	
	private String value;
	
	public ItemName(String rawName) {
		this.value = rawName;
	}
	
	public String getValue() {
		return value;
	}
	
	public boolean isAgedBrie() {
		return AGED_BRIE.equals(value);
	}
	
	public boolean isSulfuras() {
		return SULFURAS.equals(value);
	}
	
	public boolean isBacktagePasses() {
		return BACKSTAGE_PASSES.equals(value);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof  ItemName))
			return false;
		ItemName itemName = (ItemName) o;
		return itemName.value.equals(value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
}
