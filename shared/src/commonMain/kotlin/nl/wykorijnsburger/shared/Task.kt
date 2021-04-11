package nl.wykorijnsburger.androidApp

data class Task(
    val title: String,
    val completed: Boolean
)

val previewTask = Task(
    title = "Example Task",
    completed = false
)
