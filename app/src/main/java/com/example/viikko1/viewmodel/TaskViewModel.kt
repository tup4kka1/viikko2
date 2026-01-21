package com.example.viikko1.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.viikko1.domain.*

class TaskViewModel : ViewModel() {

    private var _tasks by mutableStateOf(listOf<Task>())
    val tasks: List<Task> get() = _tasks

    init {
        _tasks = taskList
    }

    fun addTask(task: Task) {
        _tasks = addTask(_tasks, task)
    }

    fun toggleDone(id: Int) {
        _tasks = toggleDone(_tasks, id)
    }

    fun removeTask(id: Int) {
        _tasks = removeTask(_tasks, id)
    }

    fun filterByDone(done: Boolean) {
        _tasks = filterByDone(_tasks, done)
    }

    fun sortByDueDate() {
        _tasks = sortByDueDate(_tasks)
    }
}
