package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView contadorIncial,contador1,contador2, contador3, contador4;
    Button boton1, boton2, boton3, boton4;
    Button resetInicial,reset1, reset2, reset3, reset4;
    int contIn=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorIncial=(TextView) findViewById(R.id.contadorInicial);
        contador1=(TextView) findViewById(R.id.contador1);
        contador2=(TextView) findViewById(R.id.contador2);
        contador3=(TextView) findViewById(R.id.contador3);
        contador4=(TextView) findViewById(R.id.contador4);


        boton1=(Button) findViewById(R.id.boton1);
        boton2=(Button) findViewById(R.id.boton1);
        boton3=(Button) findViewById(R.id.boton1);
        boton4=(Button) findViewById(R.id.boton1);

        resetInicial=(Button) findViewById(R.id.resetInicial);
        reset1=(Button) findViewById(R.id.reset1);
        reset2=(Button) findViewById(R.id.reset2);
        reset3=(Button) findViewById(R.id.reset3);
        reset4=(Button) findViewById(R.id.reset4);

        resetInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorIncial.setText(contIn);
            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cont1=0;
                cont1++;
                contador1.setText(cont1);
                contadorIncial.setText(contIn+cont1);
            }
        });
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1.setText(0);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cont2=0;
                cont2++;
                contador1.setText(cont2);
                contadorIncial.setText(contIn+cont2);
            }
        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2.setText(0);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cont3=0;
                cont3++;
                contador1.setText(cont3);
                contadorIncial.setText(contIn+cont3);
            }
        });
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3.setText(0);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cont4=0;
                cont4++;
                contador4.setText(cont4);
                contadorIncial.setText(contIn+cont4);
            }
        });
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4.setText(0);
            }
        });
    }
}
