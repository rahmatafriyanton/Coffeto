package com.kelompok7.coffeto.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.divider.MaterialDividerItemDecoration;
import com.kelompok7.coffeto.R;
import com.kelompok7.coffeto.adapter.CartAdapter;

public class CartFragment extends Fragment {

    private static CartAdapter adapter;
    RecyclerView rvCart;

    public CartFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_cart, container, false);
        rvCart = (RecyclerView) contentView.findViewById(R.id.rvCart);
        adapter = new CartAdapter();
        LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());

        rvCart.setHasFixedSize(true);
        rvCart.setLayoutManager(linearLayout);
        rvCart.setAdapter(adapter);
        rvCart.addItemDecoration(new MaterialDividerItemDecoration(this.getContext(), linearLayout.getOrientation()));

        return contentView;
    }
}