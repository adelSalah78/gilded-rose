package com.gildedrose;

public class AgedBrieItem extends AbstractItem {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void decreaseSellIn() throws Exception {
        throw new Exception("Not implemented");
    }
}
