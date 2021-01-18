package com.gildedrose;

public class AbstractItem extends Item {
    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void decreaseSellIn() throws Exception {
        throw new Exception("Not implemented");
    }

}
