package com.minicrm.data

import com.minicrm.model.Customer

class CustomerRepository {
    fun getCustomers(): List<Customer> {
        return listOf(
            Customer(1, "Budi Santoso", "budi@example.com"),
            Customer(2, "Siti Aminah", "siti@example.com")
        )
    }
}