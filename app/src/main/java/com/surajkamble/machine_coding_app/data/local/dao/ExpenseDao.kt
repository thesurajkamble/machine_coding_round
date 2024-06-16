package com.surajkamble.machine_coding_app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.surajkamble.machine_coding_app.data.local.entities.ExpenseEntity
import com.surajkamble.machine_coding_app.domain.entity.AddExpenseEntity

@Dao
interface ExpenseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(expenseEntity: AddExpenseEntity): Long

    @Query("SELECT * from expenses WHERE id = :expenseId")
    suspend fun getExpenseById(expenseId: Long): AddExpenseEntity

    @Query("SELECT * FROM expenses")
    suspend fun getAllExpenses(): List<ExpenseEntity>
}