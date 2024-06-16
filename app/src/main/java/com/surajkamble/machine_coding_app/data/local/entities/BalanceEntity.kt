package com.surajkamble.machine_coding_app.data.local.entities

import androidx.room.Entity

@Entity(
    tableName = "balances",
    primaryKeys = ["userId", "otherUserId"]
)
data class BalanceEntity(
    val userId: Long,
    val otherUserId: Long,
    val amount: Double
)
