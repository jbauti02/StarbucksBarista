package com.example.joaquin.starbucksbarista;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class HomeActivity extends FragmentActivity {

    RadioGroup sizeGroup;
    String drinkSize = "drink_size";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        sizeGroup = (RadioGroup)findViewById(R.id.size_group);
        sizeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.short_radio:
                        drinkSize = "Short";
                        break;
                    case R.id.tall_radio:
                        drinkSize = "Tall";
                        break;
                    case R.id.grande_radio:
                        drinkSize = "Grande";
                        break;
                    case R.id.venti_radio:
                        drinkSize = "Venti";
                        break;
                    default:
                }
            }
        });
    }

    public void getAmericano(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Americano");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getEspresso(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Espresso");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getCAS(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Caramel Apple Spice");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getHotChocolate(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Hot Chocolate");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getIcedDrinks(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Iced Drinks");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getSyrupPumps(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "Syrup Pumps");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }

    public void getMisc(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        intent.putExtra(Integer.toString(R.string.key), "MISC");
        intent.putExtra(Integer.toString(R.string.size_key), drinkSize);
        startActivity(intent);
    }
}
