package com.example.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);
    }
    public void updateText(View view){
        textView1.setText("Hallo, Yudha Christian Yarno Putra  C2157201030\n Kamu berhasil Membuat tugas ini");
        System.out.println("Hallo, Yudha Christian Yarno Putra C2157201030\n Kamu berhasil Membuat tugas ini");
    }
}