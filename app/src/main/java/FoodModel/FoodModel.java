package FoodModel;

public class FoodModel {
    private String foodName;
    private String foodPrice;
    //private String foodImageUrl;
    private String category;


    public FoodModel(String foodName, String foodPrice, String category) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.category = category;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

//    public String getFoodImageUrl() {
//        return foodImageUrl;
//    }

//    public void setFoodImageUrl(String foodImageUrl) {
//        this.foodImageUrl = foodImageUrl;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
