package com.material.components.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import com.material.components.R;
import android.widget.Button;

import com.material.components.activity.verification.VerificationPhone;
import com.material.components.adapter.MainMenuAdapter;
import com.material.components.data.SharedPref;
import com.material.components.utils.Tools;

public class MainMenu extends AppCompatActivity {

    private RecyclerView recycler;
    private MainMenuAdapter adapter;
    private SharedPref sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonclick = (Button)findViewById(R.id.get_started);

        buttonclick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent1= new Intent(MainMenu.this, VerificationPhone.class);
                startActivity(intent1);
            }
        });
    }




}
