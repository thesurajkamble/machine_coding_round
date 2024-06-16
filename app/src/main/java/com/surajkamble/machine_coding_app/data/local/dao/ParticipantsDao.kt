package com.surajkamble.machine_coding_app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.surajkamble.machine_coding_app.data.local.entities.ExpenseEntity
import com.surajkamble.machine_coding_app.data.local.entities.ExpenseParticipantsEntity

@Dao
interface ParticipantsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(expenseEntity: ExpenseEntity)

    @Query("SELECT * FROM expense_participants WHERE expenseId = :expenseId")
    suspend fun getParticipantsByExpenseId(expenseId: Long): List<ExpenseParticipantsEntity>

    @Query("SELECT * FROM expense_participants WHERE userId = :userId")
    suspend fun getExpensesByUserId(userId: Long): List<ExpenseParticipantsEntity>
}