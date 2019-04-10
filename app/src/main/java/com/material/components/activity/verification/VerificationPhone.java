package com.material.components.activity.verification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.material.components.R;
import com.material.components.activity.MainMenu;
import com.material.components.utils.Tools;

public class VerificationPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_phone);
        Tools.setSystemBarColor(this, R.color.grey_20);

        Button continueVerification = (Button)findViewById(R.id.continue_verification);

        continueVerification.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent

                Intent intent2= new Intent(VerificationPhone.this, VerificationCode.class);
                startActivity(intent2);
            }
        });
    }
}
