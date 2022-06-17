package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Korean3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean3);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-924-7107");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%EB%B0%80%EC%96%91%EC%86%90%EC%B9%BC%EA%B5%AD%EC%88%98/@37.5939808,127.0174982,17z/data=!3m1!4b1!4m5!3m4!1s0x357cbcbf6a650fff:0x786e4bc7f59ef745!8m2!3d37.5939766!4d127.0196869?hl=ko");
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