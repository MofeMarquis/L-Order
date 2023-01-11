package com.example.lorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import Fragments.FavouriteFragment;
import Fragments.HomeFragment;
import Fragments.OrderFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    FavouriteFragment favouriteFragment =  new FavouriteFragment();
    HomeFragment homeFragment = new HomeFragment();
    OrderFragment orderFragment = new OrderFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        //replace the main activity with home fragment
        //getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homeFragment).commit();

        //in case user selects any of the fragments
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
                        return true;
                    case R.id.favourites:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, favouriteFragment).commit();
                        return true;
                    case R.id.order:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, orderFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }//END OF ON CREATE METHOD
}//END OF MAIN ACTIVITY CLASS