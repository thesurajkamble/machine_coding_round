package com.surajkamble.machine_coding_app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.surajkamble.machine_coding_app.domain.entity.AddExpenseEntity

@Dao
interface ExpenseDao {

    @Insert
    suspend fun addExpense(expenseEntity: AddExpenseEntity)

    @Query("SELECT * from ExpenseDataBase")
    suspend fun getAllExpenses(amount:Double, paidBy:String):AddExpenseEntity
}