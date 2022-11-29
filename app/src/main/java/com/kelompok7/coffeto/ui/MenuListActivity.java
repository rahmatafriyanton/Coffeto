package com.kelompok7.coffeto.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.divider.MaterialDividerItemDecoration;
import com.kelompok7.coffeto.MainActivity;
import com.kelompok7.coffeto.R;
import com.kelompok7.coffeto.adapter.MenuListAdapter;

public class MenuListActivity extends AppCompatActivity implements View.OnClickListener {

    private static MenuListAdapter adapter;
    RecyclerView rvMenu;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        backBtn = (ImageView) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(this);
        setupRecycleView();

    }

    private void setupRecycleView() {
        rvMenu = (RecyclerView) findViewById(R.id.rvListMenu);
        adapter = new MenuListAdapter();

        LinearLayoutManager linearLayout = new LinearLayoutManager(this);

        rvMenu.setHasFixedSize(true);
        rvMenu.setLayoutManager(linearLayout);
        rvMenu.setAdapter(adapter);
    }

    private void backToHome() {
        Intent myIntent = new Intent(MenuListActivity.this, MainActivity.class);
        MenuListActivity.this.startActivity(myIntent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                backToHome();
        }
    }
}