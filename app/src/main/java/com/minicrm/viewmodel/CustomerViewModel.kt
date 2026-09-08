package com.minicrm.viewmodel

import androidx.lifecycle.ViewModel
import com.minicrm.data.CustomerRepository
import com.minicrm.model.Customer

class CustomerViewModel(private val repository: CustomerRepository) : ViewModel() {
    fun fetchCustomers(): List<Customer> {
        return repository.getCustomers()
    }
}