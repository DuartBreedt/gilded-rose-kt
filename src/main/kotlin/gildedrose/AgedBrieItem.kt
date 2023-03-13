package gildedrose

class AgedBrieItem(name: String, sellIn: Int, quality: Int) : UpdatableItem(name, sellIn, quality) {

    override fun getNewQuality(): Int =
        if (sellIn <= 0) quality + 2 else quality + 1
}
