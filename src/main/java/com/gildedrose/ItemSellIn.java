package com.gildedrose;

public class ItemSellIn {
	
	private Integer value;
	
	public ItemSellIn(Integer rawSellIn) {
		this.value = rawSellIn;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void decrease() {
		value --;
	}
	
	public boolean isLessOrEqualThan(Integer days) {
		return value <= days;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ItemSellIn))
			return false;
		ItemSellIn itemSellIn = (ItemSellIn) obj;
		return itemSellIn.value.equals(value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
}
