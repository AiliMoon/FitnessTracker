package com.example.android.fitnesstracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class DataBase : RoomDatabase(){
    abstract fun getRunDao(): RunDao
}