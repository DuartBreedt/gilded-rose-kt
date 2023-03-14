package gildedrose

abstract class UpdatableItem(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {

    abstract val dailyQualityModifier: Int

    fun updateSellIn() {
        sellIn--
    }

    fun updateQuality() {
        quality = maxOf(0, minOf(quality + dailyQualityModifier, 50))
    }
}