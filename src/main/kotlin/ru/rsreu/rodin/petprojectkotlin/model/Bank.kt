package ru.rsreu.rodin.petprojectkotlin.model

data class Bank(
    val id: Long,
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)