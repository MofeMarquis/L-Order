package com.example.lorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodItemActivity extends AppCompatActivity {

    private ImageView foodImageActivity;
    private TextView foodDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);

        foodImageActivity = findViewById(R.id.foodImageActivity);
        foodDescription =  findViewById(R.id.foodDescription);

        foodImageActivity = findViewById(R.id.foodImageActivity);
        foodDescription = findViewById(R.id.foodDescription);
    }
}