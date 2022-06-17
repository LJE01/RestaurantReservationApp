package com.jjinppang.restaurantreservationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Korean2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean2);

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:02-921-7667");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%ED%83%9C%EC%A1%B0%EA%B0%90%EC%9E%90%EA%B5%AD/@37.5908562,127.016304,17z/data=!4m9!1m2!2m1!1z7ISc7Jq4IOyEseu2geq1rCDrs7TrrLjroZwzNOq4uCA0MyDshLjtlZnruYzrlKk!3m5!1s0x357cbcc701f688bb:0xf9ef2a3f6d37fe6f!8m2!3d37.5907742!4d127.0177204!15sCi_shJzsmrgg7ISx67aB6rWsIOuztOusuOuhnDM06ri4IDQzIOyEuO2Vmeu5jOuUqVo1IjPshJzsmrgg7ISx67aB6rWsIOuztOusuCDroZwgMzQg6ri4IDQzIOyEuO2VmSDruYzrlKmSARRnYW1qYXRhbmdfcmVzdGF1cmFudA?hl=ko");
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