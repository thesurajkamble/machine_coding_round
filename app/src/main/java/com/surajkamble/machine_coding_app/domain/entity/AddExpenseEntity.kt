package com.surajkamble.machine_coding_app.domain.entity

data class AddExpenseEntity(
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
