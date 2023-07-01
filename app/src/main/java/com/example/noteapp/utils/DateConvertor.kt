package com.example.noteapp.utils

import androidx.room.TypeConverter
import java.util.Date

class DateConvertor {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateTimeStamp(timestamp: Long): Date? {
        return Date(timestamp)
    }
}