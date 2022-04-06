package com.savieliev.anton.shoppinglist.domain.usecases

import com.savieliev.anton.shoppinglist.domain.entities.ShopItem
import com.savieliev.anton.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject

class EditShopItemUseCase @Inject constructor(
    private val shopListRepository: ShopListRepository
) {

    suspend fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}