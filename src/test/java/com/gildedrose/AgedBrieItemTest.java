package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AgedBrieItemTest {

    @Test
    void checkAgedBrieSellInPassed() throws Exception {
        AgedBrieItem actual = new AgedBrieItem("AgedBrie",4,10);
        AgedBrieItem expected = new AgedBrieItem("AgedBrie",3,11);


        actual.decreaseSellIn();

        assertEquals(expected.sellIn,actual.sellIn);
        assertEquals(expected.quality,actual.quality);
    }

}