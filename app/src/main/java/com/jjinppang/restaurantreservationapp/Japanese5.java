package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Japanese5 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japanese5);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-929-1655");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%EA%B8%B4%EC%9E%90%EB%A3%8C%EC%BD%94%EC%84%B1%EC%8B%A0%EC%97%AC%EB%8C%80%EC%A0%90/@37.5917466,127.0109791,15z/data=!3m1!4b1!4m5!3m4!1s0x357cbcb8be534fa7:0x3475e52b0865deae!8m2!3d37.5917299!4d127.0197339?hl=ko");
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