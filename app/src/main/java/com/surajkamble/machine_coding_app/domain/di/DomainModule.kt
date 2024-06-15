package com.surajkamble.machine_coding_app.domain.di

import com.surajkamble.machine_coding_app.domain.usecase.AddExpenseUseCase
import com.surajkamble.machine_coding_app.domain.usecase.AddExpenseUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAddExpenseUseCase(
        addExpenseUseCase: AddExpenseUseCaseImpl
    ) : AddExpenseUseCase
}