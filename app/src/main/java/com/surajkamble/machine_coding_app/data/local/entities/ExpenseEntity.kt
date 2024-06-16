package com.surajkamble.machine_coding_app.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val amount: Double,
    val description: String,
    val payerId:Long
)
