package com.daviverissimo_app.matemticautility.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daviverissimo_app.matemticautility.R;
import com.daviverissimo_app.matemticautility.control.Sistema;

public class ActivityCalcularRaiz extends AppCompatActivity {
    private EditText edtRaiz;
    private EditText edtExpoentRadiciado;
    private Button btnCalcularRaiz;
    private TextView resultadoRaiz;
    private Sistema sistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_raiz);
        edtRaiz = (EditText) findViewById(R.id.edtRaiz);
        edtExpoentRadiciado = (EditText) findViewById(R.id.edtExpoentRadiciado);
        btnCalcularRaiz = (Button) findViewById(R.id.btnCalcularRaiz);
        resultadoRaiz = (TextView) findViewById(R.id.resultadoRaiz);

        btnCalcularRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sistema = new Sistema();
                float raiz = Float.parseFloat(edtRaiz.getText().toString());
                float expoent = Float.parseFloat(edtExpoentRadiciado.getText().toString());
                long aux = sistema.calcularRaiz(expoent, raiz);
                String resultado = Long.toString(aux);
                resultadoRaiz.setText(resultado);
            }
        });

    }
}