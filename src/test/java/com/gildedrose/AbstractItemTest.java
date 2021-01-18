package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AbstractItemTest {

    @Test
    void checkCurrentSellInTest() throws Exception {
        AbstractItem actual = new AbstractItem("Item",0,10);
        AbstractItem expected = new AbstractItem("Item",-1,5);

        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality ,actual.quality);
    }
}