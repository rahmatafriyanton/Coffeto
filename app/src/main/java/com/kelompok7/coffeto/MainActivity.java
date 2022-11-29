package com.kelompok7.coffeto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;;

import com.kelompok7.coffeto.databinding.ActivityMainBinding;
import com.kelompok7.coffeto.ui.CartFragment;
import com.kelompok7.coffeto.ui.HomeFragment;
import com.kelompok7.coffeto.ui.InfoFragment;
import com.kelompok7.coffeto.ui.TransactionFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNV.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.cart:
                    replaceFragment(new CartFragment());
                    break;

                case R.id.transaction:
                    replaceFragment(new TransactionFragment());
                    break;

                case R.id.info:
                    replaceFragment(new InfoFragment());
                    break;
            }

            return  true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

}