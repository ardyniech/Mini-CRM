package com.minicrm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.minicrm.data.CustomerRepository
import com.minicrm.model.Customer
import kotlinx.coroutines.launch

class CustomerViewModel(private val repository: CustomerRepository) : ViewModel() {
    val allCustomers = repository.allCustomers

    fun addCustomer(customer: Customer) = viewModelScope.launch {
        repository.insert(customer)
    }

    fun removeCustomer(customer: Customer) = viewModelScope.launch {
        repository.delete(customer)
    }
}