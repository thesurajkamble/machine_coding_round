package com.surajkamble.machine_coding_app.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.surajkamble.machine_coding_app.domain.usecase.AddExpenseUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class AddExpenseViewModel @Inject constructor(
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

