package com.jbc.todoapp.addtask.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {
    //DA0
    abstract fun taskDao():TaskDao
}