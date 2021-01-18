package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BackstagePassesItemTest {

    @Test
    void checkBackstagePassesSellInPassed() throws Exception {
        BackstagePassesItem actual = new BackstagePassesItem("Backstage passes",12,10);
        BackstagePassesItem expected = new BackstagePassesItem("Backstage passes",11,11);

        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality,actual.quality);
    }

    @Test
    void checkBackstagePassesSellInLessThan10() throws Exception {
        BackstagePassesItem actual = new BackstagePassesItem("Backstage passes",11,10);
        BackstagePassesItem expected = new BackstagePassesItem("Backstage passes",10,20);

        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality,actual.quality);
    }

    @Test
    void checkBackstagePassesSellInLessThan5() throws Exception {
        BackstagePassesItem actual = new BackstagePassesItem("Backstage passes",6,10);
        BackstagePassesItem expected = new BackstagePassesItem("Backstage passes",5,30);

        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality,actual.quality);
    }

    @Test
    void checkBackstagePassesSellInEquals0() throws Exception {
        BackstagePassesItem actual = new BackstagePassesItem("Backstage passes",1,10);
        BackstagePassesItem expected = new BackstagePassesItem("Backstage passes",0,0);

        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality,actual.quality);
    }
}