package com.andy.todocompose.inheritance

open class Secondary : BaseClass() {
    override fun like() {
        super.like()
        println("I like Python and Flutter")
    }
}