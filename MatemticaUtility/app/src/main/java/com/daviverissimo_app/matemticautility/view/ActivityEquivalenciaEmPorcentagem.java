package com.daviverissimo_app.matemticautility.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daviverissimo_app.matemticautility.R;
import com.daviverissimo_app.matemticautility.control.Sistema;

public class ActivityEquivalenciaEmPorcentagem extends AppCompatActivity {
    private EditText edtNumero2;
    private EditText edtPocentagemEquivale;
    private Button btnCalcularPorcentagem;
    private TextView resultadoPorcentagemEquivalente;
    private Sistema sistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equivalencia_em_porcentagem);
        this.setTitle("Equivalencia em porcentagem");
        edtNumero2 = (EditText) findViewById(R.id.edtNumero2);
        edtPocentagemEquivale = (EditText) findViewById(R.id.edtPocentagemEquivale);
        btnCalcularPorcentagem = (Button) findViewById(R.id.btnCalcularPorcentagem);
        resultadoPorcentagemEquivalente = (TextView) findViewById(R.id.resultadoPorcentagemEquivalente);

        btnCalcularPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sistema = new Sistema();
                float numero = Float.parseFloat(edtNumero2.getText().toString());
                float porcentagem = Float.parseFloat(edtPocentagemEquivale.getText().toString());
                float aux = sistema.calcularQuantosPorcentoDoNumero(numero, porcentagem);
                String resultado = Float.toString(aux);
                resultadoPorcentagemEquivalente.setText(resultado + "%");
            }
        });
    }
}