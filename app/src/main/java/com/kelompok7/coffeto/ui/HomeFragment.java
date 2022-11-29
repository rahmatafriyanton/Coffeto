package com.kelompok7.coffeto.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.kelompok7.coffeto.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
    }

    private MaterialCardView foodMenu, drinkMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_home, container, false);
        foodMenu = (MaterialCardView) contentView.findViewById(R.id.foodMenu);
        drinkMenu = (MaterialCardView) contentView.findViewById(R.id.drinkMenu);

        foodMenu.setOnClickListener(this);
        drinkMenu.setOnClickListener(this);
        return contentView;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.foodMenu:
               navigateToListMenu();
                break;
            case R.id.drinkMenu:
                navigateToListMenu();
                break;
        }
    }

    private void navigateToListMenu() {
        Intent myIntent = new Intent(getActivity(), MenuListActivity.class);
        HomeFragment.this.startActivity(myIntent);
    }
}