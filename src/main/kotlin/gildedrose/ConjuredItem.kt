package gildedrose

class ConjuredItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override fun getNewQuality(): Int =
        if (sellIn <= 0) quality - 4 else quality - 2
}