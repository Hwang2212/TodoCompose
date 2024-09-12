package com.andy.todocompose.inheritance

class Offspring : Secondary(), Archery, Singer {
    override fun archery() {
        println("Offspring shoouffting Stuff")
    }

    override fun sing() {
        println("Offspring Singing Ching Chong")
    }
}