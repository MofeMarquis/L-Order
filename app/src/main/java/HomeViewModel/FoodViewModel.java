package HomeViewModel;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import FoodModel.FoodModel;

public class FoodViewModel extends ViewModel {

    private ArrayList<FoodModel> foodItems = new ArrayList<>();

    public ArrayList<FoodModel> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodModel> foodItems) {
        this.foodItems = foodItems;
    }
}
