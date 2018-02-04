package com.example.yudiprasetya.yudiprasetya_1106130060_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "RESTO";
    String VM, NR;
    Integer Vporsi, total;
    EditText EMenu, EPorsi;
    Button BEa, BAb;
    Bundle a,b;
    Integer hargaA = 30000;
    Integer hargaB= 50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EMenu = (EditText)findViewById(R.id.ed_menu);
        EPorsi = (EditText)findViewById(R.id.ed_porsi);
        BEa = (Button)findViewById(R.id.btn_eatbus);
        BAb = (Button)findViewById(R.id.btn_abnormal);

        BAb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KActivity.class);
                VM = EMenu.getText().toString();
                Vporsi = Integer.valueOf(EPorsi.getText().toString().trim());
                total = Vporsi * hargaA;
                NR = BAb.getText().toString();

                a = new Bundle();
                a.putString("parse_menu",VM);
                a.putInt("parse_porsi", Vporsi);
                a.putInt("parse_total", total);
                a.putString("parse_nama", NR);
                intent.putExtras(a);
                startActivity(intent);

                if(total < 65500) {
                    Toast toast = Toast.makeText(MainActivity.this, "Makan disini aja ", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        BEa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KActivity.class);
                VM = EMenu.getText().toString();
                Vporsi = Integer.parseInt(EPorsi.getText().toString());
                total = Vporsi * hargaB;
                NR = BEa.getText().toString();

                b = new Bundle();
                b.putString("parse_menu",VM);
                b.putInt("parse_porsi",Vporsi);
                b.putInt("parse_total",total);
                b.putString("parse_nama", NR);
                intent.putExtras(b);
                startActivity(intent);

                if(total < 65500) {
                    Toast toast = Toast.makeText(MainActivity.this, "Makan disini aja ", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}