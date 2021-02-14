package com.example.a8mm.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.a8mm.R;
import com.google.android.material.navigation.NavigationView;

public class CategoryFragment extends Fragment implements View.OnClickListener {
    @Nullable

    DrawerLayout drawerLayout;
    ImageView navigationBar;
    NavigationView navigationView;
    private View view;
    private TextView One,Two;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.categories_fragment, container,false);
        onSetNavigationDrawerEvents();
        return view;
        
    }


    private void onSetNavigationDrawerEvents() {
        drawerLayout = (DrawerLayout) view.findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) view.findViewById(R.id.navigationView);



        navigationBar = (ImageView) view.findViewById(R.id.navigationBar);

        One = (TextView) view.findViewById(R.id.textView3);
        Two = (TextView) view.findViewById(R.id.textView4);

        navigationBar.setOnClickListener(this);
        One.setOnClickListener(this);
        Two.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.navigationBar:
                drawerLayout.openDrawer(navigationView, true);
                break;
            case R.id.textView3:
                Toast.makeText(getContext(), "One", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView4:
                Toast.makeText(getContext(), "Two", Toast.LENGTH_SHORT).show();
                break;


        }
    }


}
