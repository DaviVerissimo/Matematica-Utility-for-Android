package com.daviverissimo_app.matemticautility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.daviverissimo_app.matemticautility.view.ActivityCalcularRaiz;
import com.daviverissimo_app.matemticautility.view.ActivityCalculoPotencia;

public class MainActivity extends AppCompatActivity {
    private Button btnCalcPotencia;
    private Button btnCalcRaiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcPotencia = (Button) findViewById(R.id.btnCalcPotencia);
        btnCalcRaiz = (Button) findViewById(R.id.btnCalcRaiz);

        btnCalcPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCalculoPotencia.class);
                startActivity(intent);
            }
        });

        btnCalcRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCalcularRaiz.class);
                startActivity(intent);
            }
        });
    }


}