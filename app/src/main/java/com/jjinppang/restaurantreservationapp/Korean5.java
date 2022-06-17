package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Korean5 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean5);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-921-4108");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%EC%B6%94%EC%96%B5%EC%9D%98+%EC%98%9B%EB%82%A0%EB%96%A1%EB%B3%B6%EC%9D%B4/@37.5914339,127.0164156,17z/data=!3m1!4b1!4m5!3m4!1s0x357cbcc77d58626d:0xd611dcf24fc391d0!8m2!3d37.5914297!4d127.0186043?hl=ko");
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