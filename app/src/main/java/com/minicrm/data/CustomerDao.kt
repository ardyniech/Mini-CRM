package com.minicrm.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.minicrm.model.Customer
import kotlinx.coroutines.flow.Flow

@Dao
interface CustomerDao {
    @Query("SELECT * FROM customer")
    fun getAllCustomers(): Flow<List<Customer>>

    @Insert
    suspend fun insertCustomer(customer: Customer)
}