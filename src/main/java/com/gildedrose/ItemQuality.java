package com.gildedrose;

public class ItemQuality implements Comparable<ItemQuality> {
	
	private static final Integer MAX_VALUE = 50;
	private static final Integer MIN_VALUE = 0;
	
	private Integer value;
	
	public ItemQuality(Integer rawQuality) {
		this.value = rawQuality;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void increase(Integer num) {
		if (value + num <= MAX_VALUE)
			value += num;
		else
			value = MAX_VALUE;
	}
	
	public void decrease(Integer num) {
		if (value - num >= MIN_VALUE)
			value -= num;
		else
			value = MIN_VALUE;
	}
	
	public void reset() {
		value = MIN_VALUE;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ItemQuality))
			return false;
		ItemQuality itemQuality = (ItemQuality) obj;
		return itemQuality.value.equals(value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public int compareTo(ItemQuality o) {
		return o.value.compareTo(value);
	}
}
