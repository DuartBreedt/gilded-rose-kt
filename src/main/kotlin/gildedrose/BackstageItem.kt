package gildedrose

class BackstageItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override val dailyQualityModifier: Int
        get() = when {
            sellIn <= 0 -> -quality
            sellIn < 6 -> 3
            sellIn < 11 -> 2
            else -> 1
        }
}
