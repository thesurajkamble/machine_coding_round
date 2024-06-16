package com.surajkamble.machine_coding_app.data.di

import com.surajkamble.machine_coding_app.data.repository.ExpenseRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideExpenseRepository(
        expenseRepository: ExpenseRepositoryImpl
    ) = expenseRepository
}