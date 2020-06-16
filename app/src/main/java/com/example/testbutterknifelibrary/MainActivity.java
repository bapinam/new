package com.example.testbutterknifelibrary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

            SinhVien sinhVien = new SinhVien();
            animal animaL = new animal();
    @Override //cái này là 1 annotation
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sinhVien.setmName(" Tên anh là abc ");
        sinhVien.setmAge(7);

        animaL.setmSkinColor("Blue");
        animaL.setmAge(3);

    }


}

