package com.jbc.todoapp.addtask.domain

import com.jbc.todoapp.addtask.data.TaskRepository
import com.jbc.todoapp.addtask.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase  @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)
    }

}