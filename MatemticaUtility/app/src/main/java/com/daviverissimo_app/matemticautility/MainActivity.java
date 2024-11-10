package com.daviverissimo_app.matemticautility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.daviverissimo_app.matemticautility.view.ActivityCalcularPorcentagem;
import com.daviverissimo_app.matemticautility.view.ActivityCalcularRaiz;
import com.daviverissimo_app.matemticautility.view.ActivityCalculoPotencia;
import com.daviverissimo_app.matemticautility.view.ActivityCalculoProporçãoPercentual;
import com.daviverissimo_app.matemticautility.view.ActivityNavegar;


public class MainActivity extends AppCompatActivity {
    private Button btnCalcPotencia;
    private Button btnCalcRaiz;
    private Button btnCalcPorcentagem;
    private Button btnCalcPorcentagemEquivalente;

    private Button btnNovaHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcPotencia = (Button) findViewById(R.id.btnCalcPotencia);
        btnNovaHome = (Button) findViewById(R.id.btnNovaHome);
        btnCalcRaiz = (Button) findViewById(R.id.btnCalcRaiz);
        btnCalcPorcentagem = (Button) findViewById(R.id.btnCalcPorcentagem);
        btnCalcPorcentagemEquivalente = (Button) findViewById(R.id.btnCalcPorcentagemEquivalente);

        btnCalcPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCalculoPotencia.class);
                startActivity(intent);
            }
        });

        btnNovaHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityNavegar.class);
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

        btnCalcPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCalcularPorcentagem.class);
                startActivity(intent);
            }
        });

        btnCalcPorcentagemEquivalente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCalculoProporçãoPercentual.class);
                startActivity(intent);
            }
        });
        //exibe o flagmento
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        BlankFragment meuFragmento = new BlankFragment();
//        fragmentTransaction.add(R.id.fragment_container, meuFragmento);
//        fragmentTransaction.commit();
// aqui


    }


}