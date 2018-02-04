package com.example.yudiprasetya.yudiprasetya_1106130060_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class KActivity extends AppCompatActivity {

    TextView ER, MC, SP, NH;
    String GM, GN;
    Integer GP, GT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edankeun);

        ER = (TextView) findViewById(R.id.edanResto);
        MC = (TextView) findViewById(R.id.menuCuy);
        SP = (TextView) findViewById(R.id.Saporsi);
        NH = (TextView) findViewById(R.id.NaisHarga);

        Bundle a = getIntent().getExtras();
        Bundle b = getIntent().getExtras();

        GM = a.getString("parse_menu");
        GP = a.getInt("parse_porsi");
        GM = b.getString("parse_menu");
        GP = b.getInt("parse_porsi");
        GT = a.getInt("parse_total");
        GT = b.getInt("parse_total");
        GN = a.getString("parse_nama");
        GN = b.getString("parse_nama");

        MC.setText(GM);
        SP.setText(String.valueOf(GP));
        NH.setText(String.valueOf(GT));
        ER.setText(GN);
    }
}