package gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GildedRoseTest {

    @Test
    fun decreaseSellInAndQuality() {
        val items = arrayOf(Item("foo", 3, 3))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(2, app.items[0].sellIn)
        assertEquals(2, app.items[0].quality)
    }

    @Test
    fun sellInReached() {
        val items = arrayOf(Item("foo", 0, 4))

        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(0, app.items[0].sellIn)
        assertEquals(2, app.items[0].quality)
    }
}
