package com.example.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.noteapp.model.Note
import com.example.noteapp.utils.DateConvertor
import com.example.noteapp.utils.UUIDConvertor

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConvertor::class, UUIDConvertor::class)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDatabaseDao
}