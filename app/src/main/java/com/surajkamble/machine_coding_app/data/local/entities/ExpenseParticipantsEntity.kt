package com.surajkamble.machine_coding_app.data.local.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import com.surajkamble.machine_coding_app.domain.entity.UserEntity

@Entity(
    tableName = "expense_participants",
    primaryKeys = ["expenseId", "userId"],
    foreignKeys = [
        ForeignKey(
            entity = ExpenseEntity::class,
            parentColumns = ["id"],
            childColumns = ["expenseId"]
        ),
        ForeignKey(entity = UserEntity::class, parentColumns = ["id"], childColumns = ["userId"])
    ]
)
data class ExpenseParticipantsEntity(
    val expenseId:Long,
    val userId:Long
)
