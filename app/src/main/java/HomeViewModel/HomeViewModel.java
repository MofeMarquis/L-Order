package HomeViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import FoodModel.FoodModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<FoodModel>> foodList;

    public LiveData<ArrayList<FoodModel>> getFoodList(){
        addFoods();
        return foodList;
    }

    private void addFoods() {
        ArrayList<FoodModel> foods = new ArrayList<>();
        foods.add(new FoodModel("Carrot Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Apricot Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Coconut Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Sponge Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Pound Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Fruit Cake", "$12.25", "dessert"));
        foods.add(new FoodModel("Lemon Cake", "$12.25", "dessert"));

        foodList.setValue(foods);
    }
}
