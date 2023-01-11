package Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lorder.FoodItemActivity;
import com.example.lorder.R;

import java.util.ArrayList;

import FoodModel.FoodModel;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    static ArrayList<FoodModel> foodModels =  new ArrayList<>();
    Context myContext;
   static final String FOODKEY = "food";

    public FoodAdapter(Context myContext) {
        this.myContext = myContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.foodName.setText(foodModels.get(position).getFoodName());
        holder.foodPrice.setText(foodModels.get(position).getFoodPrice());
        holder.foodCategory.setText(foodModels.get(position).getCategory());

        holder.foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FoodItemActivity.class);
                myContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return foodModels.size();
    }


    public void setFoodModels(ArrayList<FoodModel> foodModels) {
        this.foodModels = foodModels;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageButton foodImage;
        private final TextView foodName, foodPrice, foodCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodCategory = itemView.findViewById(R.id.categoryName);
        }
    }
}
