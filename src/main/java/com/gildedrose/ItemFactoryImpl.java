package com.gildedrose;

public class ItemFactoryImpl extends AbstractItemFactory {
    @Override
    public AbstractItem createItem(Item item) {
        if(item.name.toLowerCase().contains("aged brie"))
            return new AgedBrieItem(item.name,item.sellIn,item.quality);
        else if(item.name.toLowerCase().contains("backstage"))
            return new BackstagePassesItem(item.name,item.sellIn,item.quality);
        else if(item.name.toLowerCase().contains("sulfuras"))
            return new SulfurasItem(item.name,item.sellIn,item.quality);
        return null;
    }
}
