package com.example.indrapro.indra_1202152164_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class menuutama extends AppCompatActivity {
    RadioGroup RBgroup1;
    RadioButton dineinRB1, takeawayRB1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        RBgroup1 = findViewById(R.id.RBgroup);
    }

    public void pesansekarang(View view) {
        int selectedId = RBgroup1.getCheckedRadioButtonId();
        dineinRB1 = findViewById(R.id.dineinRB);
        takeawayRB1 = findViewById(R.id.takeawayRB);

        //untuk pemilihan ke layout yang dituju sesuai radio button yang dipilih
        if (selectedId == dineinRB1.getId()){
            Intent intent = new Intent(menuutama.this, dinein.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(menuutama.this, takeaway.class);
            startActivity(intent);
        }
    }
}
