package gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items.filterIsInstance<UpdatableItem>()) {
            item.updateQuality()
            item.updateSellIn()
        }
    }
}
