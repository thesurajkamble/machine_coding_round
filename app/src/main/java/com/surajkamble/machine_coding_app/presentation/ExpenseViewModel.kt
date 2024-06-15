package com.surajkamble.machine_coding_app.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.surajkamble.machine_coding_app.domain.usecase.AddExpenseUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class ExpenseViewModel @Inject constructor(
    private val addExpenseUseCase: AddExpenseUseCase
) : ViewModel() {

//    val _expense :MutableStateFlow<>

    /*
        take inputs from the user,
        add participants
        split equally

     */

    fun addExpense(amount: Double, paidBy: String) {
        viewModelScope.launch {
            addExpenseUseCase.execute(
                amount = amount,
                paidBy = paidBy
            )
        }
    }
}

