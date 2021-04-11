package nl.wykorijnsburger.androidApp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskRow(task: Task) {
    val checkedState = remember { mutableStateOf(task.completed)}

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
        Checkbox(checked = checkedState.value, onCheckedChange = {
            checkedState.value = it
        })
        Spacer(Modifier.size(24.dp))
        Text(task.title)
    }
}

@Preview
@Composable
fun TaskRowPreview() {
    ThemedPreview {
        TaskRow(task = previewTask)
    }
}
