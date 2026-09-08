package com.minicrm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minicrm.model.Customer

class CustomerViewModel : ViewModel() {
    private val _customerList = MutableLiveData<List<Customer>>()
    val customerList: LiveData<List<Customer>> get() = _customerList

    fun addCustomer(customer: Customer) {
        val currentList = _customerList.value.orEmpty().toMutableList()
        currentList.add(customer)
        _customerList.value = currentList
    }
}