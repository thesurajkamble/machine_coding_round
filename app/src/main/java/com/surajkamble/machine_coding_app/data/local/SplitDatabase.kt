package com.surajkamble.machine_coding_app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.surajkamble.machine_coding_app.data.local.dao.BalanceDao
import com.surajkamble.machine_coding_app.data.local.dao.ExpenseDao
import com.surajkamble.machine_coding_app.data.local.dao.ParticipantsDao
import com.surajkamble.machine_coding_app.data.local.dao.UserDao
import com.surajkamble.machine_coding_app.data.local.entities.BalanceEntity
import com.surajkamble.machine_coding_app.data.local.entities.ExpenseEntity
import com.surajkamble.machine_coding_app.data.local.entities.ExpenseParticipantsEntity
import com.surajkamble.machine_coding_app.data.local.entities.UserEntity

@Database(
    entities = [ExpenseEntity::class,
        UserEntity::class,
        ExpenseParticipantsEntity::class,
        BalanceEntity::class],
    version = 1,
    exportSchema = false
)
abstract class SplitDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
    abstract fun userDao(): UserDao
    abstract fun expenseParticipantsDao(): ParticipantsDao
    abstract fun balanceDao(): BalanceDao
}