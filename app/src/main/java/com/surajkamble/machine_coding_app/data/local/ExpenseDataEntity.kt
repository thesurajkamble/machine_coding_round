package com.surajkamble.machine_coding_app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.surajkamble.machine_coding_app.domain.entity.AddExpenseEntity

@Entity
data class ExpenseDataEntity(
    @PrimaryKey(autoGenerate = true) val userId: Int,
    val amount: Double,
    val description: String,
    val total: Double,
    val participants: List<Participants>
) {
    data class Participants(
        val name: String,
        val paidBy: Boolean
    )
}
