package com.savieliev.anton.shoppinglist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.savieliev.anton.shoppinglist.domain.entities.ShopItem

class ShopItemDiffCallback : DiffUtil.ItemCallback<ShopItem>() {

    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }
}