package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_peso;
    Button btn_calcular;
    TextView lbl_maisPeso, lbl_menosPeso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_peso = findViewById(R.id.txt_peso);
        btn_calcular = findViewById(R.id.btn_calcularPeso);
        lbl_maisPeso = findViewById(R.id.lbl_maisPeso);
        lbl_menosPeso = findViewById(R.id.lbl_menosPeso);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.parseDouble(txt_peso.getText().toString());
               lbl_maisPeso.setText(aumentoPeso(peso) + " kg");
               lbl_menosPeso.setText(descontoPeso(peso) +" Kg");
            }
        });
    }
    private double aumentoPeso(double valor){
        double novoPeso = 0.0;
        double aumentoPeso = (valor * 15) / 100;
        novoPeso = valor + aumentoPeso;
        return novoPeso;
    }
    private double descontoPeso(double valor){
        double novoPeso = 0.0;
        double descontoPeso = (valor * 25) / 100;
        novoPeso = valor - descontoPeso;
        return novoPeso;
    }
}