package com.example.arya.aryawirasandi_1202150077_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class pilihmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihmenu);
    }
    public void ok(View view) {
        if (((RadioButton)findViewById(R.id.radioButton)).isChecked()){ //radio button untuk memilih dine in
            Intent intent = new Intent(this, takeaway.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.radioButton2)).isChecked()){ //untuk memilih take away
            Intent intent = new Intent(this, dinein.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
}
