package com.savieliev.anton.shoppinglist.domain.usecases

import com.savieliev.anton.shoppinglist.domain.entities.ShopItem
import com.savieliev.anton.shoppinglist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}