package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SulfurasItemTest {

    @Test
    void SulfurasItemSellInDecrease() throws Exception {
        SulfurasItem actual = new SulfurasItem("Sulfuras",10,10);
        SulfurasItem expected = new SulfurasItem("Sulfuras",9,10);

        actual.decreaseSellIn();

        assertEquals(expected.quality,actual.quality);
        assertEquals(expected.sellIn,actual.sellIn);
    }

}