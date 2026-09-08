package com.minicrm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.minicrm.data.CustomerRepository
import com.minicrm.model.Customer

class CustomerViewModel(private val repository: CustomerRepository) : ViewModel() {
    private val _customers = MutableLiveData<List<Customer>>()
    val customers: MutableLiveData<List<Customer>> = _customers

    fun loadCustomers() {
        _customers.value = repository.getCustomers()
    }
}