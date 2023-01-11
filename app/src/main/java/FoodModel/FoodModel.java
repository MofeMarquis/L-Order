package FoodModel;

import android.os.Parcel;
import android.os.Parcelable;

public class FoodModel implements Parcelable {
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
