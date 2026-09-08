package com.minicrm.data

import com.minicrm.model.Customer

interface ICustomerRepository {
    fun getCustomers(): List<Customer>
}

class CustomerRepository : ICustomerRepository {
    override fun getCustomers(): List<Customer> {
        // Simulated data retrieval
        return listOf(Customer("1", "John Doe", "john@example.com", "123456789"))
    }
}