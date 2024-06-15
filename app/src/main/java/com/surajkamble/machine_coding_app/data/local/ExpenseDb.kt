package com.surajkamble.machine_coding_app.data.local

import androidx.room.Database

@Database(entities = [ExpenseDataEntity::class], version = 1)
abstract class ExpenseDb {
    abstract fun expenseDao(): ExpenseDao
}