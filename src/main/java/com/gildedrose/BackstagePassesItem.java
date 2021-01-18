package com.gildedrose;

public class BackstagePassesItem extends AbstractItem {
    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void decreaseSellIn() throws Exception {
        //throw new Exception("Not implemented");

        this.sellIn-=1;
        if(this.sellIn > 10) {
            quality+=1;
        }
        else if(this.sellIn <= 10 && this.sellIn > 5) {
            quality*=2;
        }
        else if(this.sellIn <= 5 && this.sellIn > 0) {
            quality*=3;
        }
        else {
            quality = 0;
        }
    }
}
