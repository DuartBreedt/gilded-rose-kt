package gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items) {
            if (item is UpdatableItem) {
                item.updateQuality(item::getNewQuality)
                item.updateSellIn()
            }
        }
    }
}
