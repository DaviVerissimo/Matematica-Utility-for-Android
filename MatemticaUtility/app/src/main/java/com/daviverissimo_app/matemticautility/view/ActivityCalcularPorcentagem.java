package com.daviverissimo_app.matemticautility.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daviverissimo_app.matemticautility.R;
import com.daviverissimo_app.matemticautility.control.Sistema;

public class ActivityCalcularPorcentagem extends AppCompatActivity {
    private EditText edtNumero;
    private EditText edtPocentagem;
    private Button btnCalcularPorcentagem;
    private TextView resultadoPorcentagem;
    private Sistema sistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_porcentagem);
        this.setTitle("Calculo de Porcentagem");
        edtNumero = (EditText) findViewById(R.id.edtNumero);
        edtPocentagem = (EditText) findViewById(R.id.edtPocentagem);
        btnCalcularPorcentagem = (Button) findViewById(R.id.btnCalcularPorcentagem);
        resultadoPorcentagem = (TextView) findViewById(R.id.resultadoPorcentagem);

        btnCalcularPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sistema = new Sistema();
                float numero = Float.parseFloat(edtNumero.getText().toString());
                float porcentagem = Float.parseFloat(edtPocentagem.getText().toString());
                float aux = sistema.calcularPorcentagem(numero, porcentagem);
                String resultado = Float.toString(aux);
                resultadoPorcentagem.setText(resultado);
            }
        });
    }
}