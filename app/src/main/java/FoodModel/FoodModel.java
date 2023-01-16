package FoodModel;

import android.os.Parcel;
import android.os.Parcelable;

public class FoodModel implements Parcelable {
    private int id;
    private String foodName;
    private String foodPrice;
    private String foodImageUrl;
    private String category;
    private String foodDescription;



    public FoodModel() {
    }

    public FoodModel(int Id, String foodName, String foodPrice, String category, String foodImageUrl, String foodDescription) {
        this.id = id;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.category = category;
        this.foodImageUrl = foodImageUrl;
        this.foodDescription = foodDescription;
    }

    public int getId() {
        return id;
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

    public String getFoodImageUrl() {
        return foodImageUrl;
    }

    public void setFoodImageUrl(String foodImageUrl) {
        this.foodImageUrl = foodImageUrl;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }



    public FoodModel(String foodName) {
        this.foodName = foodName;
    }

    protected FoodModel(Parcel in){
        foodName = in.readString();
    }

    public static final Creator<FoodModel> CREATOR = new Creator<FoodModel>() {
        @Override
        public FoodModel createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public FoodModel[] newArray(int i) {
            return new FoodModel[i];
        }
    };

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(foodName);

    }
}
