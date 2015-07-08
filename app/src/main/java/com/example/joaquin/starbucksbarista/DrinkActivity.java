package com.example.joaquin.starbucksbarista;

import android.support.v4.app.Fragment;

public class DrinkActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new DrinkFragment();
    }
}
