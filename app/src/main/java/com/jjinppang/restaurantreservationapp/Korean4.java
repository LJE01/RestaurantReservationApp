package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Korean4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean4);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-928-0356");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%ED%95%A0%EB%A7%A4%EB%8B%AD%EA%B0%88%EB%B9%84/@37.590938,127.0152606,17z/data=!3m1!4b1!4m5!3m4!1s0x357cbcc7993dd69b:0xe2a2da0c0df665b7!8m2!3d37.5909338!4d127.0174493?hl=ko");
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