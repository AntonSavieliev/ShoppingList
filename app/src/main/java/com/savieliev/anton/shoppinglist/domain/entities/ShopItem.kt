package com.savieliev.anton.shoppinglist.domain.entities

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)