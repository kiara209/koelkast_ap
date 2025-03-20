package com.example.koelkast_ap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HoofdKoelkastFragment extends Fragment {
    private RecyclerView fridgeItemsRecyclerView;
    private FloatingActionButton addButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hoofd_koelkast, container, false);

        // Initialize views
        fridgeItemsRecyclerView = view.findViewById(R.id.fridge_items_recycler_view);
        addButton = view.findViewById(R.id.add_item_button);

        // Set up RecyclerView with GridLayoutManager (3 columns)
        fridgeItemsRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        // TODO: Set up adapter for fridge items

        // Set up add button click listener
        addButton.setOnClickListener(v -> {
            // Show category selection dialog
            showCategorySelectionDialog();
        });

        return view;
    }

    private void showCategorySelectionDialog() {
        // TODO: Implement category selection dialog with the following categories:
        // - Zuivel (Dairy)
        // - Groente en Fruit (Vegetables and Fruits)
        // - Vlees (Meat)
        // - Vis (Fish)
        // - Overig (Other)
    }
} 