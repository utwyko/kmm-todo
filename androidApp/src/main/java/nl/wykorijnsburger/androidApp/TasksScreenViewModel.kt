package nl.wykorijnsburger.androidApp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import nl.wykorijnsburger.shared.TasksRepository

class TasksScreenViewModel(): ViewModel() {

    private val tasksRepository = TasksRepository()

    private val _tasks = MutableLiveData<List<Task>>()
    val tasks: LiveData<List<Task>> = _tasks

    init {
        _tasks.value = tasksRepository.tasks()
    }
}
