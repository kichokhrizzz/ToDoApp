package com.jbc.todoapp.addtask.ui

import com.jbc.todoapp.addtask.ui.model.TaskModel

sealed interface TaskUiState {
    object Loading : TaskUiState
    data class Error(val throwable: Throwable) : TaskUiState
    data class Success(val tasks: List<TaskModel>) : TaskUiState
}