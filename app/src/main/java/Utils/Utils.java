package Utils;

import java.util.ArrayList;

import FoodModel.FoodModel;

public class Utils {

    private static Utils instance;
    private static ArrayList<FoodModel> allFoodsList;
    private static ArrayList<FoodModel> allOrderList;
    private static ArrayList<FoodModel> allFavouriteList;


    private Utils() {
        if(null == allFoodsList){
            allFoodsList = new ArrayList<>();
            initData();
        }
    }

    private void initData() {
        //TODO: add initial data
        allFoodsList.add(new FoodModel(1, "Carrot Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/z/slice-carrot-cake-frosting-white-background-120780610.jpg", "carrot description"));
        allFoodsList.add(new FoodModel(2, "Apricot Cake", "$12.25", "dessert","https://thumbs.dreamstime.com/b/apricot-cake-dessert-plate-31402226.jpg", "apricot description"));
        allFoodsList.add(new FoodModel(3, "Coconut Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/coconut-cake-28982904.jpg", "coconut description"));
        allFoodsList.add(new FoodModel(4, "Sponge Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/victoria-sponge-cake-coffee-88699339.jpg", "sponge description"));
        allFoodsList.add(new FoodModel(5, "Chocolate Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/chocolate-cake-rich-milk-strawberry-topping-55467895.jpg", "choco description"));
        allFoodsList.add(new FoodModel(6, "Fruit Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/christmas-fruit-cake-27768707.jpg", "fruit description"));
        allFoodsList.add(new FoodModel(7, "Lemon Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/lemon-yogurt-loaf-cake-sliced-plate-creative-wooden-background-your-design-68075917.jpg", "lemon description"));
        allFoodsList.add(new FoodModel(8, "Red Velvet", "$12.25", "dessert", "https://thumbs.dreamstime.com/z/cake-red-velvet-white-cream-wooden-table-close-up-space-to-write-81832896.jpg", "red description"));

    }

    public static Utils getInstance() {
        if (null == instance) {
            instance = new Utils();
            return instance;
        }
        return instance;
    }

    public static ArrayList<FoodModel> getAllFoodsList() {
        return allFoodsList;
    }

    public static ArrayList<FoodModel> getAllOrderList() {
        return allOrderList;
    }

    public static ArrayList<FoodModel> getAllFavouriteList() {
        return allFavouriteList;
    }

}
