package com.example.mvctutorial.designpattern._15observer.part2

fun main() {
    val button = Button()
    button.addObserver { o, arg ->
        println("$o is called")
    }

    button.addObserver { o, arg ->
        println("$o is called2")
    }

    button.onClick()
    button.onClick()
    button.onClick()
}