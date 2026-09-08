package com.minicrm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.minicrm.model.Customer

@Database(entities = [Customer::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun customerDao(): CustomerDao
}