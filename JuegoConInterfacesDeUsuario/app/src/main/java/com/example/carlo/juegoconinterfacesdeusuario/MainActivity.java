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
    private PreguntaQuiz[] lista_preguntas = new PreguntaQuiz[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargar las preguntas
        lista_preguntas[0] = new PreguntaQuiz("¿Cúal es el nombre de la mascota de Mickey Mouse?","Goofy", "Donald", "Pluto");
        lista_preguntas[1] = new PreguntaQuiz("¿Cómo se le llama a un grupo de lobos", "Rebaño", "Camada", "Manada");
        lista_preguntas[2] = new PreguntaQuiz("¿Qué personajes de un cuento de hadas terminaron en una casa de jengibre?", "Jack y Jill", "Hansel y Gretel", "Alicia y el conejo");
        lista_preguntas[3] = new PreguntaQuiz("¿Qué famoso actor de Hollywood dijo la siguiente frase?: Volveré", "Mel Gibson", "Bruce Willis", "Arnold Schwarzenegger");
        lista_preguntas[4] = new PreguntaQuiz("¿Cuál es el río más largo del mundo?", "Amazona", "Nilo", "Mississippi");

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
