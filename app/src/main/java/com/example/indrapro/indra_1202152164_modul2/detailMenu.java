package com.example.indrapro.indra_1202152164_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class detailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        //mengeset button back agar muncul di view
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //menerima value yang dikirimkan dari activity
        String menu = getIntent().getStringExtra("menu");
        String price = getIntent().getStringExtra("price");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer image = getIntent().getIntExtra("image", 0);

        //mendifinisikan TextView dan ImageView
        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtPrice = findViewById(R.id.price);
        TextView txtkomposisi = findViewById(R.id.listkomposisi);
        ImageView images = findViewById(R.id.imageMenu);

        //mengeset valuen
        txtMenu.setText(menu);
        txtPrice.setText(price);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //function  button back
        onBackPressed();
        return true;
    }
}
