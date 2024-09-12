package com.andy.todocompose.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val repository: CounterRepository = CounterRepository()
    private val _count = mutableIntStateOf(repository.getCounter().count)

    // expose _count
    val count: MutableState<Int> = _count

    fun increment() {
        repository.increment()
        _count.value = repository.getCounter().count
    }

    fun decrement() {
        repository.decrement()
        _count.value = repository.getCounter().count

    }

}