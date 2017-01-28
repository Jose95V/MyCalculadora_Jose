package com.example.josedanilo.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sumar, restar, dividir, multiplicar;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)  findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        dividir = (Button) findViewById(R.id.dividir);
        multiplicar = (Button) findViewById(R.id.multiplicar);

        resultado = (TextView) findViewById(R.id.resultado);


        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int ent1 = Integer.parseInt(n1);
        int ent2 = Integer.parseInt(n2);

        int resp = 0;


        switch (view.getId()){

            case R.id.sumar:
                resp = ent1+ent2;
                break;

            case R.id.restar:
                resp = ent1-ent2;
                break;

            case R.id.dividir:
                resp = ent1/ent2;
                break;

            case R.id.multiplicar:
                resp = ent1*ent2;
                break;
        }

        resultado.setText(""+resp);
    }
}
