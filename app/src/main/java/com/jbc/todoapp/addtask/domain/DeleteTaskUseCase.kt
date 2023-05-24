package com.jbc.todoapp.addtask.domain

import com.jbc.todoapp.addtask.data.TaskRepository
import com.jbc.todoapp.addtask.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DeleteTaskUseCase  @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }

}