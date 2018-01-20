package com.debdroid.hf.dp.factory

abstract class Pizza {
    var name: String = ""
    var dough: String = ""
    var sauce: String = ""
    val toppings: ArrayList<String> = arrayListOf()

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings:")
        toppings.indices
                .map { toppings[it] }
                .forEach { println("  $it") }
    }

    fun bake() {
        println("Bake for 30 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Putting the pizza in official PizzaStore box")
    }

//    fun getName() = name
}