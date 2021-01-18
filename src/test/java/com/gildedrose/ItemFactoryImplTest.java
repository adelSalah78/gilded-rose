package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ItemFactoryImplTest {

    AbstractItemFactory factory =  new ItemFactoryImpl();
    @Test
    void createAgedBrieItem() {
        Object item = factory.createItem("Aged Brie");
        assertEquals(true,item instanceof AgedBrieItem);
    }

    @Test
    void createBackstageItem() {
        Object item = factory.createItem("Backstage passes to a TAFKAL80ETC concert");
        assertEquals(true,item instanceof BackstagePassesItem);
    }

    @Test
    void createSulfurasItem() {
        Object item = factory.createItem("Sulfuras, Hand of Ragnaros");
        assertEquals(true,item instanceof SulfurasItem);
    }

    @Test
    @Disabled
    void createAbstractItem() {
        Object item = factory.createItem("Aged Brie");
        assertEquals(true,item instanceof AgedBrieItem);
    }

}