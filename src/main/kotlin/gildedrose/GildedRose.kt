package gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (i in items.indices) {
            when (items[i]) {
                is AgedBrieItem -> {}

                is BackstageItem -> {}

                is SulfurasItem -> {}

                is ConjuredItem -> {}

                else -> {}
            }

            if (items[i] !is AgedBrieItem && items[i] !is BackstageItem && items[i] !is SulfurasItem) {
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1

                    if (items[i] is BackstageItem) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1
                            }
                        }
                    }
                }
            }

            if (items[i] !is SulfurasItem) {
                items[i].sellIn = items[i].sellIn - 1
            }

            if (items[i].sellIn < 0) {
                if (items[i] !is AgedBrieItem) {
                    if (items[i] !is BackstageItem) {
                        if (items[i].quality > 0) {
                            if (items[i] !is SulfurasItem) {
                                items[i].quality = items[i].quality - 1
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1
                    }
                }
            }
        }
    }
}
