package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Float;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    EditText editTextBase;
    EditText editTextAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Triangulo umTriangulo = new Triangulo();

        btn = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editTextBase  = (EditText) findViewById(R.id.editTextBase);
        editTextAltura  = (EditText) findViewById(R.id.editTextAltura);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float base = Float.parseFloat(editTextBase.getText().toString());
                float altura = Float.parseFloat(editTextAltura.getText().toString());
                umTriangulo.setAltura(altura);
                umTriangulo.setBase(base);
                umTriangulo.calculaArea();

                textView.setText(umTriangulo.toString());
            }
        });
    }
}