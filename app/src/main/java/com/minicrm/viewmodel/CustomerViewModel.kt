package com.minicrm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.minicrm.data.ICustomerRepository
import com.minicrm.model.Customer

class CustomerViewModel(private val repository: ICustomerRepository) : ViewModel() {
    fun getCustomerList(): List<Customer> = repository.getCustomers()
}

class CustomerViewModelFactory(private val repository: ICustomerRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CustomerViewModel(repository) as T
    }
}