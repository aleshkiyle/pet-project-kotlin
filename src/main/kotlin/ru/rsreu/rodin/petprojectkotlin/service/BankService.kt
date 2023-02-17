package ru.rsreu.rodin.petprojectkotlin.service

import org.springframework.stereotype.Service
import ru.rsreu.rodin.petprojectkotlin.dataSource.BankDataSource
import ru.rsreu.rodin.petprojectkotlin.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): List<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun createBank(bank: Bank): Bank = dataSource.createBank(bank)

}