package com.gildedrose;

public class BackstagePassesItem extends AbstractItem {
    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void decreaseSellIn() throws Exception {
        throw new Exception("Not implemented");
    }
}
