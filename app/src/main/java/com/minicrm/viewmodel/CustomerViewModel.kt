package com.minicrm.viewmodel

import androidx.lifecycle.*
import com.minicrm.data.CustomerRepository
import com.minicrm.model.Customer
import kotlinx.coroutines.launch

class CustomerViewModel(private val repository: CustomerRepository) : ViewModel() {
    val allCustomers: LiveData<List<Customer>> = repository.allCustomers.asLiveData()

    fun insert(customer: Customer) = viewModelScope.launch {
        repository.insert(customer)
    }

    fun delete(customer: Customer) = viewModelScope.launch {
        repository.delete(customer)
    }
}