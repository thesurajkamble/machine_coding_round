package com.surajkamble.machine_coding_app.data.repository

interface ExpenseRepository {
   suspend fun addAllExpense(amount:Double, paidBy:String)

   suspend fun splitExpense()

   suspend fun settleExpenses()

   suspend fun getBalance()
}