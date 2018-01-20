package com.debdroid.hf.dp.factory

fun main(args: Array<String>) {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza: Pizza? = nyStore.orderPizza("pepperoni")
    println("Ethan ordered a ${pizza?.name} \n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza?.name}")
}