package com.surajkamble.machine_coding_app.data.di

import com.surajkamble.machine_coding_app.data.local.ExpenseDao
import com.surajkamble.machine_coding_app.data.local.ExpenseDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideExpenseDao(expenseDb: ExpenseDb): ExpenseDao = expenseDb.expenseDao()

}