package com.daviverissimo_app.matemticautility.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daviverissimo_app.matemticautility.R;
import com.daviverissimo_app.matemticautility.control.Sistema;

public class ActivityCalculoPotencia extends AppCompatActivity {
    private EditText edtBase;
    private EditText edtExpoentElevado;
    private Button btnCalcularPotencia;
    private TextView resultadoPotencia;
    private Sistema sistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_potencia);
        edtBase = (EditText) findViewById(R.id.edtBase);
        edtExpoentElevado = (EditText)findViewById(R.id.edtExpoentElevado);
        btnCalcularPotencia = (Button) findViewById(R.id.btnCalcularPotencia);
        resultadoPotencia = (TextView) findViewById(R.id.resultadoPotencia);
        this.setTitle("Calculo de Potencia");
        btnCalcularPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sistema = new Sistema();
                float base = Float.parseFloat(edtBase.getText().toString());
                float expoent = Float.parseFloat(edtExpoentElevado.getText().toString());
                long aux = sistema.calcularPotencia(expoent, base);
                System.out.println("aux " + aux);
                String resultado = Long.toString(aux);
                System.out.println("resultado " + resultado);
                resultadoPotencia.setText(resultado);
            }
        });
    }
}