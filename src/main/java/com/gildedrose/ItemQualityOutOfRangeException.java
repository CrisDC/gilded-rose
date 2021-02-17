package com.gildedrose;

public class ItemQualityOutOfRangeException extends IllegalArgumentException {
	public ItemQualityOutOfRangeException(String name, Integer quality) {
		super("Tried to set an ItemQuality of " + quality +  " which is outside the valid range of Item " + name);
	}
}
