package nl.wykorijnsburger.shared

import nl.wykorijnsburger.androidApp.Task

class TasksRepository {

    fun tasks(): List<Task> {
        return List(50) { Task("Example task", false) }
    }
}
