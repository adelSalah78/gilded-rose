package com.gildedrose;

public class AbstractItem extends Item {
    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void decreaseSellIn() throws Exception {
        //throw new Exception("Not implemented");

        this.sellIn-=1;
        if(this.sellIn <= 0){
            this.quality = this.quality / 2;
        }
    }

}
