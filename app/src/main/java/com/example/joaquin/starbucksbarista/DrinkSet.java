package com.example.joaquin.starbucksbarista;

import java.util.ArrayList;

/**
 * Created by J on 6/29/2015.
 */
public class DrinkSet {
    private ArrayList<Drink> drinks = new ArrayList<Drink>();
    private static String drinkType, drinkSize;
    private static DrinkSet drinkSet;

    public DrinkSet(String drinkType, String drinkSize) {

        this.drinkType = drinkType;
        this.drinkSize = drinkSize;

        switch (drinkType) {
            case "Americano":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Americano Shots for Short", "2 shots"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Americano Shots for Tall", "2 shots"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Americano Shots for Grande", "3 shots"));
                } else {
                    drinks.add(new Drink("Americano Shots for Venti", "4 shots"));
                }
                break;

            case "Espresso":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Expresso Shots for Short", "1 shot"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Expresso Shots for Tall", "1 shot"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Expresso Shots for Grande", "2 shots"));
                } else {
                    drinks.add(new Drink("Expresso Shots for Venti", "2 shots"));
                }
                break;

            case "Caramel Apple Spice":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Caramel Apple Spice for Short", "2 of Cinnamon Dulce"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Caramel Apple Spice for Tall", "3 of Cinnamon Dulce"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Caramel Apple Spice for Grande", "4 of Cinnamon Dulce"));
                } else {
                    drinks.add(new Drink("Caramel Apple Spice for Venti", "5 of Cinnamon Dulce"));
                }
                break;

            case "Hot Chocolate":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Hot Chocolate for Short", "2 Mocha and 1 Vanilla"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Hot Chocolate for Tall", "3 Mocha and 1 Vanilla"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Hot Chocolate for Grande", "4 Mocha and 1 Vanilla"));
                } else {
                    drinks.add(new Drink("Hot Chocolate for Venti", "5 Mocha and 2 Vanilla"));
                }
                break;

            case "Iced Drinks":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("No Iced Drinks for Short", "Please select and use the other sizes"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Iced Americano for Tall", "2 shots"));
                    drinks.add(new Drink("Iced Syrup for Tall", "3 pumps"));
                    drinks.add(new Drink("Iced for Tall", "1 shot"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Iced Americano for Grande", "3 shots"));
                    drinks.add(new Drink("Iced Syrup for Grande", "4 pumps"));
                    drinks.add(new Drink("Iced for Grande", "2 shots"));
                } else {
                    drinks.add(new Drink("Iced Americano for Venti", "4 shots"));
                    drinks.add(new Drink("Iced Syrup for Venti", "6 pumps"));
                    drinks.add(new Drink("Iced for Venti", "3 shots"));
                }
                break;

            case "Syrup Pumps":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Syrup pumps for Short", "2 pumps"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Syrup pumps for Tall", "3 pumps"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Syrup pumps for Grande", "4 pumps"));
                } else {
                    drinks.add(new Drink("Syrup pumps for Venti", "5 pumps"));
                }
                break;

            case "MISC":
                if(drinkSize.equals("Short")) {
                    drinks.add(new Drink("Americano", "No syrup, only shots and water"));
                    drinks.add(new Drink("Caffe Mocha", "Syrup pumps, add mocha with shots and steam milk, and whipped cream"));
                    drinks.add(new Drink("Cappuccino", "No syrup, half milk with half foam"));
                    drinks.add(new Drink("Expresso", "No syrup, only shots"));
                    drinks.add(new Drink("Frapps System", "Coffee french roast, milk(whole), syrup(flavor), chips(chocolate, if frap requires it" +
                                         "), ice, base(cream)"));
                    drinks.add(new Drink("Iced Syrup for Trenta", "7 pumps"));
                    drinks.add(new Drink("Latte", "No syrup, shots with steamed milk or milk"));
                    drinks.add(new Drink("Smoothie System", "Protein powder, 2% milk, ice, banana"));
                } else if(drinkSize.equals("Tall")) {
                    drinks.add(new Drink("Americano", "No syrup, only shots and water"));
                    drinks.add(new Drink("Caffe Mocha", "Syrup pumps, add mocha with shots and steam milk, and whipped cream"));
                    drinks.add(new Drink("Cappuccino", "No syrup, half milk with half foam"));
                    drinks.add(new Drink("Expresso", "No syrup, only shots"));
                    drinks.add(new Drink("Frapps System", "Coffee french roast, milk(whole), syrup(flavor), chips(chocolate, if frap requires it" +
                            "), ice, base(cream)"));
                    drinks.add(new Drink("Iced Syrup for Trenta", "7 pumps"));
                    drinks.add(new Drink("Latte", "No syrup, shots with steamed milk or milk"));
                    drinks.add(new Drink("Smoothie System", "Protein powder, 2% milk, ice, banana"));
                } else if(drinkSize.equals("Grande")) {
                    drinks.add(new Drink("Americano", "No syrup, only shots and water"));
                    drinks.add(new Drink("Caffe Mocha", "Syrup pumps, add mocha with shots and steam milk, and whipped cream"));
                    drinks.add(new Drink("Cappuccino", "No syrup, half milk with half foam"));
                    drinks.add(new Drink("Expresso", "No syrup, only shots"));
                    drinks.add(new Drink("Frapps System", "Coffee french roast, milk(whole), syrup(flavor), chips(chocolate, if frap requires it" +
                            "), ice, base(cream)"));
                    drinks.add(new Drink("Iced Syrup for Trenta", "7 pumps"));
                    drinks.add(new Drink("Latte", "No syrup, shots with steamed milk or milk"));
                    drinks.add(new Drink("Smoothie System", "Protein powder, 2% milk, ice, banana"));
                } else {
                    drinks.add(new Drink("Americano", "No syrup, only shots and water"));
                    drinks.add(new Drink("Caffe Mocha", "Syrup pumps, add mocha with shots and steam milk, and whipped cream"));
                    drinks.add(new Drink("Cappuccino", "No syrup, half milk with half foam"));
                    drinks.add(new Drink("Expresso", "No syrup, only shots"));
                    drinks.add(new Drink("Frapps System", "Coffee french roast, milk(whole), syrup(flavor), chips(chocolate, if frap requires it" +
                            "), ice, base(cream)"));
                    drinks.add(new Drink("Iced Syrup for Trenta", "7 pumps"));
                    drinks.add(new Drink("Latte", "No syrup, shots with steamed milk or milk"));
                    drinks.add(new Drink("Smoothie System", "Protein powder, 2% milk, ice, banana"));
                }
                break;

        }

    }

    public static DrinkSet getDrinkSet() {
        drinkSet = new DrinkSet(drinkType, drinkSize);
        return drinkSet;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public Drink getDrink(int id) {
        return drinks.get(id);
    }

}
