package com.debdroid.hf.dp.factory

class ChicagoStyleCheesePizza : Pizza() {

    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}