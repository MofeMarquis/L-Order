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


public class HomeFragment extends Fragment {
    private FoodAdapter foodAdapter;
    private RecyclerView foodRecyclerView;
    private ArrayList<FoodModel> foodModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        foodRecyclerView = view.findViewById(R.id.homeRecyclerView);
        foodAdapter = new FoodAdapter(getActivity());
        foodRecyclerView.setAdapter(foodAdapter);
        foodRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        setFoodData();

        foodAdapter.setFoodModels(foodModels);


    }

    //ADD FOOD DATA TO ARRRAY
    public void setFoodData(){
        foodModels.add(new FoodModel("Carrot Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Apricot Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Coconut Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Sponge Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Pound Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Fruit Cake", "$12.25", "dessert"));
        foodModels.add(new FoodModel("Lemon Cake", "$12.25", "dessert"));
    }
}