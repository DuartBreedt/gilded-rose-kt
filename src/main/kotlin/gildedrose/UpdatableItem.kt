package gildedrose

abstract class UpdatableItem(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {

    abstract fun getNewQuality(): Int

    open fun updateSellIn() {
        sellIn--
    }

    fun updateQuality(getNewQuality: () -> Int) {
        quality = maxOf(0, minOf(getNewQuality(), 50))
    }
}