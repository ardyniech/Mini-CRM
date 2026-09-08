package com.minicrm.model

/**
 * Immutable data model for Customer entity.
 */
data class Customer(
    val id: String,
    val name: String,
    val email: String,
    val phone: String
)