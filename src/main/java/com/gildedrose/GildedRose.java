package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() throws Exception{
        for (int i = 0; i < items.length; i++) {
            AbstractItem item = new ItemFactoryImpl().createItem(items[i]);
            item.decreaseSellIn();
        }
    }
}