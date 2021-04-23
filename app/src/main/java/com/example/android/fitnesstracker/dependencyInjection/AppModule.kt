package com.example.android.fitnesstracker.dependencyInjection

import android.content.Context
import androidx.room.Room
import com.example.android.fitnesstracker.database.DataBase
import com.example.android.fitnesstracker.other.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        DataBase::class.java,
        Constants.RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun providesRunDao(db: DataBase) = db.getRunDao()
}