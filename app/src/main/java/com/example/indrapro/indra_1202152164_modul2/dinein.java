package com.example.indrapro.indra_1202152164_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein extends AppCompatActivity {
    Spinner spinner1;
    String spinner11 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        spinner1 = findViewById(R.id.spinner);//untuk inisiasi spinner dan connect ke id spinner
        // untuk membuat fungsi meload data source spinner
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner1 != null){spinner1.setAdapter(adapter);

        }
    }


    public void pesan(View view) {
        String meja = spinner1.getSelectedItem().toString();
        Intent intent = new Intent(dinein.this, RecyclerViewActivity.class);
        Toast.makeText(this, "anda DineIn di : " +meja, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}

