package com.gildedrose;

public class SulfurasItem extends AbstractItem {
    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void decreaseSellIn() throws Exception {
        //throw new Exception("Not implemented");
        this.sellIn-=1;
    }
}
