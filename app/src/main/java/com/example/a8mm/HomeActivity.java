package com.example.a8mm;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.a8mm.fragments.CategoryFragment;
import com.example.a8mm.fragments.HomeFragment;
import com.example.a8mm.fragments.WishlistFragment;
import com.example.a8mm.fragments.profilefragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener)navigation);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigation =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.orders:
                            Log.i("Checking","Orders");
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.goout:
                            Log.i("Checking","goout");
                            selectedFragment = new CategoryFragment();
                            break;
                        case R.id.gold:
                            Log.i("Checking","gold");
                            selectedFragment = new profilefragment();
                            break;
                        case R.id.videos:
                            Log.i("Checking","videos");
                            selectedFragment = new WishlistFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };




}