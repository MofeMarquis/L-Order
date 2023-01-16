package Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lorder.R;

import java.util.ArrayList;

import Adapter.FoodAdapter;
import FoodModel.FoodModel;
import HomeViewModel.FoodViewModel;


public class HomeFragment extends Fragment {
    private FoodViewModel viewModel;
    private FoodAdapter foodAdapter;
    private RecyclerView foodRecyclerView;
    private static ArrayList<FoodModel> foodModels = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new FoodViewModel();
        viewModel.setFoodItems(setFoodData());
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        foodRecyclerView = view.findViewById(R.id.homeRecyclerView);
        foodAdapter = new FoodAdapter(getActivity());
        foodRecyclerView.setAdapter(foodAdapter);
        foodRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        foodAdapter.setFoodModels(foodModels);
        foodAdapter.notifyDataSetChanged();

        return view;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null){
            viewModel.setFoodItems(savedInstanceState.getParcelable("FOOD_ITEMS_KEY"));
        }
    }

    //    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        foodRecyclerView = view.findViewById(R.id.homeRecyclerView);
//        foodAdapter = new FoodAdapter(getActivity());
//        foodRecyclerView.setAdapter(foodAdapter);
//        foodRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
//
//        setFoodData();
//
//        foodAdapter.setFoodModels(foodModels);
//
//
//    }

    //ADD FOOD DATA TO ARRAY
    public ArrayList<FoodModel> setFoodData(){
        foodModels.add(new FoodModel("Carrot Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/z/slice-carrot-cake-frosting-white-background-120780610.jpg", "carrot description"));
        foodModels.add(new FoodModel("Apricot Cake", "$12.25", "dessert","https://thumbs.dreamstime.com/b/apricot-cake-dessert-plate-31402226.jpg", "apricot description"));
        foodModels.add(new FoodModel("Coconut Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/coconut-cake-28982904.jpg", "coconut description"));
        foodModels.add(new FoodModel("Sponge Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/victoria-sponge-cake-coffee-88699339.jpg", "sponge description"));
        foodModels.add(new FoodModel("Chocolate Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/chocolate-cake-rich-milk-strawberry-topping-55467895.jpg", "choco description"));
        foodModels.add(new FoodModel("Fruit Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/christmas-fruit-cake-27768707.jpg", "fruit description"));
        foodModels.add(new FoodModel("Lemon Cake", "$12.25", "dessert", "https://thumbs.dreamstime.com/b/lemon-yogurt-loaf-cake-sliced-plate-creative-wooden-background-your-design-68075917.jpg", "lemon description"));
        foodModels.add(new FoodModel("Red Velvet", "$12.25", "dessert", "https://thumbs.dreamstime.com/z/cake-red-velvet-white-cream-wooden-table-close-up-space-to-write-81832896.jpg", "red description"));
        return foodModels;
    }
}