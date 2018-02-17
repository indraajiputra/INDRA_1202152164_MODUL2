package com.example.indrapro.indra_1202152164_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Indra Pro on 2/17/2018.
 */

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;
    //untuk mengisi di daftar meu
    private String[] menu = {"Nasi Goreng", "Mie Goreng", "Mie Goreng", "Mie Goreng", "Mie Goreng", "Mie Goreng"};
    //untuk mengisi didaftar harga
    private String[] price = {"10.000", "10.000", "10.000", "10.000", "10.000", "10.000"};
    //untuk menload  src gambar
    private int[] image = {R.drawable.nasigoreng, R.drawable.nasigoreng, R.drawable.nasigoreng, R.drawable.nasigoreng, R.drawable.nasigoreng,
            R.drawable.nasigoreng};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();
        //untuk mengatur layout
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(Menu, Price, Gambar);

        recyclerView.setAdapter(adapter);

    }

    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}
