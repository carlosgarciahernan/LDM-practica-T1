package com.example.carlo.juegoconinterfacesdeusuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int contadorPreguntas=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Botón siguiente
        Button btnNext = (Button) findViewById(R.id.btnNext);
        final TextView cntP = (TextView) findViewById(R.id.cntP);
        btnNext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                pasarDePregunta(cntP);
            }
        });

    }


    private void pasarDePregunta(TextView cntP){
        String texto = "Pregunta "+contadorPreguntas;
        contadorPreguntas++;
        cntP.setText(texto);

    }
}
