package gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GildedRoseTest {

    @Test
    fun basicTest() {
        val items = arrayOf(Item("foo", 2, 4))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(1, app.items[0].sellIn)
        assertEquals(3, app.items[0].quality)

        app.updateQuality()

        assertEquals(0, app.items[0].sellIn)
        assertEquals(2, app.items[0].quality)

        app.updateQuality()

        assertEquals(-1, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)

        app.updateQuality()

        assertEquals(-2, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)
    }

    @Test
    fun agedBrie() {
        val items = arrayOf(Item("Aged Brie", 2, 45))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(1, app.items[0].sellIn)
        assertEquals(46, app.items[0].quality)

        app.updateQuality()

        assertEquals(0, app.items[0].sellIn)
        assertEquals(47, app.items[0].quality)

        app.updateQuality()

        assertEquals(-1, app.items[0].sellIn)
        assertEquals(49, app.items[0].quality)

        app.updateQuality()

        assertEquals(-2, app.items[0].sellIn)
        assertEquals(50, app.items[0].quality)
    }

    @Test
    fun sulfuras() {
        // FIXME: BUG! Shouldn't be an exact match
        val items = arrayOf(Item("Sulfuras, Hand of Ragnaros", 2, 80))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(2, app.items[0].sellIn)
        assertEquals(80, app.items[0].quality)

        app.updateQuality()

        assertEquals(2, app.items[0].sellIn)
        assertEquals(80, app.items[0].quality)
    }

    @Test
    fun backstage_passes() {
        val items = arrayOf(Item("Backstage passes to a TAFKAL80ETC concert", 11, 30))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(10, app.items[0].sellIn)
        assertEquals(31, app.items[0].quality)

        app.updateQuality()

        assertEquals(9, app.items[0].sellIn)
        assertEquals(33, app.items[0].quality)

        app.updateQuality()

        assertEquals(8, app.items[0].sellIn)
        assertEquals(35, app.items[0].quality)

        app.updateQuality()

        assertEquals(7, app.items[0].sellIn)
        assertEquals(37, app.items[0].quality)

        app.updateQuality()

        assertEquals(6, app.items[0].sellIn)
        assertEquals(39, app.items[0].quality)

        app.updateQuality()

        assertEquals(5, app.items[0].sellIn)
        assertEquals(41, app.items[0].quality)

        app.updateQuality()

        assertEquals(4, app.items[0].sellIn)
        assertEquals(44, app.items[0].quality)

        app.updateQuality()

        assertEquals(3, app.items[0].sellIn)
        assertEquals(47, app.items[0].quality)

        app.updateQuality()

        assertEquals(2, app.items[0].sellIn)
        assertEquals(50, app.items[0].quality)

        app.updateQuality()

        assertEquals(1, app.items[0].sellIn)
        assertEquals(50, app.items[0].quality)

        app.updateQuality()

        assertEquals(0, app.items[0].sellIn)
        assertEquals(50, app.items[0].quality)

        app.updateQuality()

        assertEquals(-1, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)
    }
}
