package com.savieliev.anton.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.savieliev.anton.shoppinglist.data.repository.ShopListRepositoryImpl
import com.savieliev.anton.shoppinglist.domain.entities.ShopItem
import com.savieliev.anton.shoppinglist.domain.usecases.DeleteShopItemUseCase
import com.savieliev.anton.shoppinglist.domain.usecases.EditShopItemUseCase
import com.savieliev.anton.shoppinglist.domain.usecases.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}