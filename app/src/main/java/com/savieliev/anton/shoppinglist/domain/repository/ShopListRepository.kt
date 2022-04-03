package com.savieliev.anton.shoppinglist.domain.repository

import androidx.lifecycle.LiveData
import com.savieliev.anton.shoppinglist.domain.entities.ShopItem

interface ShopListRepository {

    suspend fun addShopItem(shopItem: ShopItem)

    suspend fun deleteShopItem(shopItem: ShopItem)

    suspend fun editShopItem(shopItem: ShopItem)

    suspend fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}