package com.minicrm.data

import com.minicrm.model.Customer
import kotlinx.coroutines.flow.Flow

class CustomerRepository(private val customerDao: CustomerDao) {
    val allCustomers: Flow<List<Customer>> = customerDao.getAllCustomers()

    suspend fun insert(customer: Customer) {
        customerDao.insert(customer)
    }

    suspend fun delete(customer: Customer) {
        customerDao.delete(customer)
    }
}