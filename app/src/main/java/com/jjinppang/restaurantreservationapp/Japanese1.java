package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Japanese1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japanese1);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-923-2666");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%EB%8F%99%EA%B2%BD%EC%82%B0%EC%B1%85/@37.5909732,126.9478387,12z/data=!4m9!1m2!2m1!1z64-Z6rK97IKw7LGF!3m5!1s0x357cbd1fcb9e24bf:0xa2cbd33445db60e2!8m2!3d37.5908494!4d127.0178784!15sCgzrj5nqsr3sgrDssYVaDyIN64-Z6rK9IOyCsOyxhZIBE2phcGFuZXNlX3Jlc3RhdXJhbnQ?hl=ko");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Reservation.class);
                startActivity(intent);
            }
        });
    }
}