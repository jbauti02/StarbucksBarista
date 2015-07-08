package com.example.joaquin.starbucksbarista;

/**
 * Created by J on 6/29/2015.
 */
public class Drink {

    private String drink;
    private String ingredient;

    public Drink(String drink, String ingredient) {
        this.drink = drink;
        this.ingredient = ingredient;
    }

    public String getDrink() {
        return drink;
    }

    public String getIngredient() {
        return ingredient;
    }

}
