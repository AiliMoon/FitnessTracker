package com.example.android.fitnesstracker.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class Run(
    var img: Bitmap? = null,
    var timestamp: Long = 0L, // amount of milliseconds, to sort them by date, when run started etc
    var averageSpeed: Float = 0f,
    var distanceInMeter: Int = 0,
    var timeInMillis: Long = 0L, // amount of time we spent running
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}