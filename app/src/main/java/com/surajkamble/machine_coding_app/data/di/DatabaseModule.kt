package com.surajkamble.machine_coding_app.data.di

import android.content.Context
import androidx.room.Room
import com.surajkamble.machine_coding_app.data.local.dao.ExpenseDao
import com.surajkamble.machine_coding_app.data.local.SplitDatabase
import com.surajkamble.machine_coding_app.data.local.dao.BalanceDao
import com.surajkamble.machine_coding_app.data.local.dao.ParticipantsDao
import com.surajkamble.machine_coding_app.data.local.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    fun provideSplitDataBase(context: Context): SplitDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            SplitDatabase::class.java,
            "splitWise_Db"
        ).build()
    }


    @Provides
    @Singleton
    fun provideExpenseDao(splitDb: SplitDatabase): ExpenseDao = splitDb.expenseDao()

    @Provides
    @Singleton
    fun provideUserDao(splitDb: SplitDatabase): UserDao = splitDb.userDao()

    @Provides
    @Singleton
    fun provideBalanceDao(splitDb: SplitDatabase): BalanceDao = splitDb.balanceDao()

    @Provides
    @Singleton
    fun provideExpenseParticipantsDao(splitDb: SplitDatabase): ParticipantsDao =
        splitDb.expenseParticipantsDao()
}