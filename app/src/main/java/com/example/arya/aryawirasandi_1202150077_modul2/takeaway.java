package com.example.arya.aryawirasandi_1202150077_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
    }
    public void oke(View view) {
        Intent intent = new Intent(this,menu.class); //intent untuk ke menu class
        startActivity(intent);
    }
}
