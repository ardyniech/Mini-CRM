package com.minicrm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class Customer(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val phone: String
) {
    init {
        require(name.isNotBlank()) { "Nama tidak boleh kosong" }
        require(email.contains("@")) { "Format email tidak valid" }
    }
}