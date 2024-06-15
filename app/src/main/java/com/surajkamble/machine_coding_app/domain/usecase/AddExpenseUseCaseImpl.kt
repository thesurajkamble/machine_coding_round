package com.surajkamble.machine_coding_app.domain.usecase

import com.surajkamble.machine_coding_app.data.repository.ExpenseRepository
import javax.inject.Inject

class AddExpenseUseCaseImpl @Inject constructor(
    private val expenseRepository: ExpenseRepository
) : AddExpenseUseCase {
    override suspend fun execute(amount: Double, paidBy: String) {
        expenseRepository.addAllExpense(
            amount = amount,
            paidBy = paidBy
        )
    }
}