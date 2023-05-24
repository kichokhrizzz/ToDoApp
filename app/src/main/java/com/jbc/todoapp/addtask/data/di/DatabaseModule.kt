package com.jbc.todoapp.addtask.data.di

import android.content.Context
import androidx.room.Room
import com.jbc.todoapp.addtask.data.TaskDao
import com.jbc.todoapp.addtask.data.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun provideTasksDao(todoDatabase: TodoDatabase): TaskDao{
        return todoDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideTodoDatabase(@ApplicationContext appContext: Context): TodoDatabase {
        return Room.databaseBuilder(appContext, TodoDatabase::class.java, "taskDatabase").build()
    }
}