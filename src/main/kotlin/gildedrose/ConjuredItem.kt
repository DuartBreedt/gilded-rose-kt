package gildedrose

class ConjuredItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override val dailyQualityModifier: Int
        get() = if (sellIn <= 0) -4 else -2
}