package com.daviverissimo_app.matemticautility.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import com.daviverissimo_app.matemticautility.R;

public class ActivityNavegar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegar); // Certifique-se de que o layout está correto

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new ChatsFragment();
                        break;
                    case R.id.nav_search:
                        selectedFragment = new ChatsFragment2();
                        break;
                    case R.id.nav_profile:
                        selectedFragment = new ChatsFragment3();
                        break;
                }

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selectedFragment)
                        .commit();
                return true;
            }
        });

        // Set default selection
        if (savedInstanceState == null) {
            bottomNavigationView.setSelectedItemId(R.id.nav_home);
        }
    }
}
