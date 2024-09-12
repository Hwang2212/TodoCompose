package com.andy.todocompose.todo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.andy.todocompose.ui.components.TodoList

@Composable
fun TodoListView(viewModel: TodoListViewModel) {

    val viewState by viewModel.todoListState
    Box(modifier = Modifier.fillMaxSize()) {
        when {
            viewState.loading -> {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }

            viewState.error != null -> {
                Text(text = viewState.error.toString(), modifier = Modifier.align(Alignment.Center))
            }

            else -> {
                TodoList(list = viewState.list)
            }
        }
    }
}

