package com.andy.todocompose.inheritance

fun main() {
    val secondary = Secondary()
    secondary.like()
    secondary.coreValues()

    var frank = Offspring()
    frank.like()
    frank.archery()
    frank.sing()
}