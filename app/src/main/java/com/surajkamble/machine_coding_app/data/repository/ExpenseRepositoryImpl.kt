package com.surajkamble.machine_coding_app.data.repository

import com.surajkamble.machine_coding_app.data.local.ExpenseDao
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {
    override suspend fun addAllExpense(amount: Double, paidBy: String) {
        expenseDao.getAllExpenses(
            amount = amount,
            paidBy = paidBy
        )
    }

    override suspend fun splitExpense() {
        TODO("Not yet implemented")
    }

    override suspend fun settleExpenses() {
        TODO("Not yet implemented")
    }

    override suspend fun getBalance() {
        TODO("Not yet implemented")
    }

}