package com.surajkamble.machine_coding_app.domain.usecase

interface AddExpenseUseCase{
    suspend fun execute(amount: Double, paidBy: String)
}