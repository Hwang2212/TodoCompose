package com.andy.todocompose.todo

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andy.todocompose.services.todoService
import kotlinx.coroutines.launch

class TodoListViewModel : ViewModel() {

    init {
        fetchTodos()
    }

    private val repository = TodoRepository()
    private val _todoListState = mutableStateOf(TodoState())
    val todoListState: State<TodoState> = _todoListState

    private fun fetchTodos() {
        viewModelScope.launch {
            try {
                val response = todoService.getTodos()
                _todoListState.value = _todoListState.value.copy(
                    loading = false,
                    list = response.todos
                )
            } catch (e: Exception) {
                _todoListState.value = _todoListState.value.copy(
                    loading = false,
                    error = "Error Fetching Todos ${e.message}",
                )
            }
        }
    }

    data class TodoState(
        val loading: Boolean = true,
        val list: List<TodoModel> = emptyList(),
        val error: String? = null,
    )
}