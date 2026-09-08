package com.minicrm.di

import com.minicrm.data.CustomerRepository

object Injection {
    fun provideRepository(): CustomerRepository {
        return CustomerRepository()
    }
}