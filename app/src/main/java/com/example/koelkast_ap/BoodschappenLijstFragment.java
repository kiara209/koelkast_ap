package com.example.koelkast_ap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BoodschappenLijstFragment extends Fragment {
    private RecyclerView shoppingListRecyclerView;
    private FloatingActionButton addButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boodschappen_lijst, container, false);

        // Initialize views
        shoppingListRecyclerView = view.findViewById(R.id.shopping_list_recycler_view);
        addButton = view.findViewById(R.id.add_item_button);

        // Set up RecyclerView
        shoppingListRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        // TODO: Set up adapter for shopping list items

        // Set up add button click listener
        addButton.setOnClickListener(v -> {
            // Show add item dialog
            showAddItemDialog();
        });

        return view;
    }

    private void showAddItemDialog() {
        // TODO: Implement dialog to add new items to shopping list
    }
} 