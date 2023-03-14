package gildedrose

class BasicItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override val dailyQualityModifier: Int
        get() = if (sellIn <= 0) -2 else -1
}
