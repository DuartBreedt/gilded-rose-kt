package gildedrose

class BackstageItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override fun getNewQuality(): Int =
        when {
            sellIn <= 0 -> 0
            sellIn < 6 -> quality + 3
            sellIn < 11 -> quality + 2
            else -> quality + 1
        }
}
