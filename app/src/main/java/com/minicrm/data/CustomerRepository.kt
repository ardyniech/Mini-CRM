package com.minicrm.data

import com.minicrm.model.Customer

class CustomerRepository {
    fun getCustomers(): List<Customer> {
        return listOf(
            Customer("1", "John Doe", "john@example.com", "123456789"),
            Customer("2", "Jane Smith", "jane@example.com", "987654321")
        )
    }
}