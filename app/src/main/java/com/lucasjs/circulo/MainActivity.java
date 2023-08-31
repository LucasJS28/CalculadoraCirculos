package com.lucasjs.circulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etradio,etarea,etperimetro,etdiametro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etradio =findViewById(R.id.etradio);
        etarea =findViewById(R.id.etarea);
        etperimetro =findViewById(R.id.etperimetro);
        etdiametro =findViewById(R.id.etdiametro);
    }

    public void calcular(View view) {
        double radio = Double.parseDouble(etradio.getText().toString());
        double area = Math.PI*radio*radio;
        double perimetro = 2*Math.PI*radio;
        double diametro = radio*2;
        etarea.setText(String.valueOf(area));
        etperimetro.setText(String.valueOf(perimetro));
        etdiametro.setText(String.valueOf(diametro));
    }
}