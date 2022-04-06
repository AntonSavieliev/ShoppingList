package com.savieliev.anton.shoppinglist.domain.usecases

import com.savieliev.anton.shoppinglist.domain.entities.ShopItem
import com.savieliev.anton.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject

class DeleteShopItemUseCase @Inject constructor(
    private val shopListRepository: ShopListRepository
) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}