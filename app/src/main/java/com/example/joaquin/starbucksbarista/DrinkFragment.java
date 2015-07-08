package com.example.joaquin.starbucksbarista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by J on 6/29/2015.
 */
public class DrinkFragment extends Fragment {

    private View view;
    private int drinkNum = 0;
    Drink drink;
    DrinkSet drinkSet;
    ArrayList<Drink> drinks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String drinkType = getActivity().getIntent().getStringExtra(Integer.toString(R.string.key));
        String drinkSize = getActivity().getIntent().getStringExtra(Integer.toString(R.string.size_key));
        drinkSet = new DrinkSet(drinkType, drinkSize);
        drinks = drinkSet.getDrinks();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_drink, container, false);
        initDrink();
        clickPrev();
        clickNext();
        return view;
    }

    private void initDrink() {
        drink = DrinkSet.getDrinkSet().getDrink(drinkNum);
        final TextView drinkTextView = (TextView)view.findViewById(R.id.drink_text_view);
        drinkTextView.setText(drink.getDrink());
        drinkTextView.setOnClickListener(new View.OnClickListener() {

            boolean switched = true;

            @Override
            public void onClick(View v) {
                if(switched) {
                    drinkTextView.setText(drink.getIngredient());
                    switched = false;
                } else {
                    drinkTextView.setText(drink.getDrink());
                    switched = true;
                }
            }
        });
    }

    private void clickPrev() {
        Button button = (Button)view.findViewById(R.id.prev_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int size = drinks.size();
                drinkNum = (drinkNum + (size - 1)) % drinks.size();
                initDrink();
            }
        });
        if(drinks.size() > 1) {
            button.setVisibility(View.VISIBLE);
        } else {
            button.setVisibility(View.INVISIBLE);
        }
    }

    private void clickNext() {
        Button button = (Button)view.findViewById(R.id.next_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                drinkNum = (drinkNum + 1) % drinks.size();
                initDrink();
            }
        });
        if(drinks.size() > 1) {
            button.setVisibility(View.VISIBLE);
        } else {
            button.setVisibility(View.INVISIBLE);
        }
    }

}
