package com.example.lorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import FoodModel.FoodModel;

public class FoodItemActivity extends AppCompatActivity {

    private ImageView foodImageActivity;
    private TextView foodDescription, foodName, foodCategory, foodPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);
        
        //calling the initViews method
        initViews();

        FoodModel foodModels = new FoodModel("Sponge Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/victoria-sponge-cake-coffee-88699339.jpg", "A decadent soft and moist vanilla flavoured cake, made from very simple fresh and local ingredients." +
                "The soft buttery and sweet cake covered with a thick layer of strawberry frosting and strawberry filling that would" +
                " linger in your mouth after a bite");
        setData(foodModels);


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