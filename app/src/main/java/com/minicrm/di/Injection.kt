package com.minicrm.di

import android.content.Context
import com.minicrm.data.AppDatabase
import com.minicrm.data.CustomerRepository

object Injection {
    fun provideRepository(context: Context): CustomerRepository {
        val database = AppDatabase.getDatabase(context)
        return CustomerRepository(database.customerDao())
    }
}