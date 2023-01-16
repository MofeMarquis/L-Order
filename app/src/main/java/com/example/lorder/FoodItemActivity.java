package com.example.lorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import FoodModel.FoodModel;
import Utils.Utils;

public class FoodItemActivity extends AppCompatActivity {

    private FoodModel foodModel;
    private ImageView foodImageActivity;
    private TextView foodDescription, foodName, foodCategory, foodPrice;
    public static final String FOOD_ID_KEY = "foodItem";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);
        
        //calling the initViews method
        initViews();


        Intent intent = getIntent();
        if(null != intent){
            int foodId = intent.getIntExtra(FOOD_ID_KEY, 0);
            if(foodId != 0){
                FoodModel incomingFood = Utils.getInstance().getFoodById(foodId);
                if(null != incomingFood){
                    setData(incomingFood);
                }
            }
        }



    }

    private void setData(FoodModel foodModels) {
        foodName.setText(foodModels.getFoodName());
        foodPrice.setText(foodModels.getFoodPrice());
        foodCategory.setText(foodModels.getCategory());
        foodDescription.setText(foodModels.getFoodDescription());
        Glide.with(this)
                .asBitmap()
                .load(foodModels.getFoodImageUrl())
                .into(foodImageActivity);


    }


    private void initViews(){
        foodName =  findViewById(R.id.foodNameActivity);
        foodImageActivity = findViewById(R.id.foodImageActivity);
        foodDescription = findViewById(R.id.foodDescriptionActivity);
        foodPrice = findViewById(R.id.foodPriceActivity);
        foodCategory = findViewById(R.id.foodCategoryActivity);
    }
}