package com.savieliev.anton.shoppinglist.domain.usecases

import com.savieliev.anton.shoppinglist.domain.entities.ShopItem
import com.savieliev.anton.shoppinglist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}