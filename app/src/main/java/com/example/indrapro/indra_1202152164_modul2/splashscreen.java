package com.example.indrapro.indra_1202152164_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //untuk pindah ke layer menuutama
                startActivity(new Intent(getApplicationContext(), menuutama.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik splashscreen
        ////untuk memunculkan toast
        Toast.makeText(splashscreen.this, "INDRA_1202152164 ", Toast.LENGTH_SHORT).show();
    }
}
