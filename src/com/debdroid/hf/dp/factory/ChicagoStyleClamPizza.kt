package com.debdroid.hf.dp.factory

class ChicagoStyleClamPizza : Pizza() {
    init {
        name = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}