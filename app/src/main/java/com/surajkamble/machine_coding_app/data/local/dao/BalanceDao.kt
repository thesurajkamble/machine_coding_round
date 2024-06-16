package com.surajkamble.machine_coding_app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.surajkamble.machine_coding_app.data.local.entities.BalanceEntity

@Dao
interface BalanceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(balanceEntity: BalanceEntity)

    @Query("SELECT * FROM balances WHERE userId = :userId AND otherUserId = :otherUserId")
    suspend fun getBalance(userId: Long, otherUserId: Long): BalanceEntity?

    @Query("SELECT * from balances WHERE userId = :userId")
    suspend fun getBalanceByUserId(userId: Long): List<BalanceEntity>
}