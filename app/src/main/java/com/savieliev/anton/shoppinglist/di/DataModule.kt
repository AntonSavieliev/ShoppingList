package com.savieliev.anton.shoppinglist.di

import android.app.Application
import com.savieliev.anton.shoppinglist.data.database.AppDatabase
import com.savieliev.anton.shoppinglist.data.database.ShopListDao
import com.savieliev.anton.shoppinglist.data.repository.ShopListRepositoryImpl
import com.savieliev.anton.shoppinglist.domain.repository.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}