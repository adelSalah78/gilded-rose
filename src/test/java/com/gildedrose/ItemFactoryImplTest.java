package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ItemFactoryImplTest {

    AbstractItemFactory factory =  new ItemFactoryImpl();
    Item item  = new Item("",0,0);
    @Test
    void createAgedBrieItem() {
        item.name = "Aged Brie";
        Object item = factory.createItem(this.item);
        assertEquals(true,item instanceof AgedBrieItem);
    }

    @Test
    void createBackstageItem() {
        item.name = "Backstage passes to a TAFKAL80ETC concert";
        Object item = factory.createItem(this.item);
        assertEquals(true,item instanceof BackstagePassesItem);
    }

    @Test
    void createSulfurasItem() {
        item.name = "Sulfuras, Hand of Ragnaros";
        Object item = factory.createItem(this.item);
        assertEquals(true,item instanceof SulfurasItem);
    }

    @Test
    @Disabled
    void createAbstractItem() {
     //   Object item = factory.createItem("Aged Brie");
       // assertEquals(true,item instanceof AgedBrieItem);
    }

}