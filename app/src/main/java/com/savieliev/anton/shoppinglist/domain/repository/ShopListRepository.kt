package com.savieliev.anton.shoppinglist.domain.repository

import androidx.lifecycle.LiveData
import com.savieliev.anton.shoppinglist.domain.entities.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}