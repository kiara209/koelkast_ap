package com.example.koelkast_ap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;

public class ReceptenFragment extends Fragment {
    private CardView inventoryBasedButton;
    private CardView allRecipesButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recepten, container, false);

        // Initialize views
        inventoryBasedButton = view.findViewById(R.id.inventory_based_button);
        allRecipesButton = view.findViewById(R.id.all_recipes_button);

        // Set up click listeners
        inventoryBasedButton.setOnClickListener(v -> {
            // Navigate to inventory-based recipes
            // TODO: Implement navigation to InventoryBasedRecipesFragment
        });

        allRecipesButton.setOnClickListener(v -> {
            // Navigate to all recipes
            // TODO: Implement navigation to AllRecipesFragment
        });

        return view;
    }
} 