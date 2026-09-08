package com.minicrm.di

import com.minicrm.data.CustomerRepository
import com.minicrm.data.ICustomerRepository

object Injection {
    fun provideRepository(): ICustomerRepository {
        return CustomerRepository()
    }
}