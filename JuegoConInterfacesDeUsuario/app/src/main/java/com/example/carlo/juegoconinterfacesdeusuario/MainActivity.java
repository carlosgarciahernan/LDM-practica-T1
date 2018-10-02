package com.example.carlo.juegoconinterfacesdeusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private int contadorPreguntas=1;
    private ArrayList<PreguntaQuiz> lista_preguntas = new ArrayList<PreguntaQuiz>();
    private int puntos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargar las preguntas
        lista_preguntas.add(new PreguntaQuiz("¿Cúal es el nombre de la mascota de Mickey Mouse?",getResources().getDrawable(R.drawable.goofy), getResources().getDrawable(R.drawable.donald),getResources().getDrawable(R.drawable.pluto), 3, "image"));
        lista_preguntas.add(new PreguntaQuiz("¿Cómo se le llama a un grupo de lobos", "Rebaño", "Camada", "Manada", 3,"radial"));
        lista_preguntas.add(new PreguntaQuiz("¿Qué personajes de un cuento de hadas terminaron en una casa de jengibre?", "Jack y Jill", "Hansel y Gretel", "Alicia y el conejo", 2,"text"));
        lista_preguntas.add(new PreguntaQuiz("¿Qué famoso actor de Hollywood dijo la siguiente frase?: Volveré", "Mel Gibson", "Bruce Willis", "Arnold Schwarzenegger", 3,"text"));
        lista_preguntas.add(new PreguntaQuiz("¿Cuál es el río más largo del mundo?", "Amazona", "Nilo", "Mississippi",1,"radial"));
        Collections.shuffle(lista_preguntas);
        // Botón siguiente
        Button btnNext = (Button) findViewById(R.id.btnNext);

        final TextView cntP = (TextView) findViewById(R.id.cntP);
        final TextView prgnt = (TextView) findViewById(R.id.prgnt);
        final Button rpst1 = (Button) findViewById(R.id.rpst1);
        final Button rpst2 = (Button) findViewById(R.id.rpst2);
        final Button rpst3 = (Button) findViewById(R.id.rpst3);
        final LinearLayout buts = (LinearLayout) findViewById(R.id.buts);
        final RadioButton rbut1 = (RadioButton) findViewById(R.id.rbut1);
        final RadioButton rbut2 = (RadioButton) findViewById(R.id.rbut2);
        final RadioButton rbut3 = (RadioButton) findViewById(R.id.rbut3);
        final LinearLayout rads = (LinearLayout) findViewById(R.id.rads);
        prgnt.setText(lista_preguntas.get(0).getPregunta());
        if(lista_preguntas.get(0).getTipo() == "text"){
            rads.setVisibility(View.GONE);
            buts.setVisibility(View.VISIBLE);
            rpst1.setBackgroundResource(0);
            rpst2.setBackgroundResource(0);
            rpst3.setBackgroundResource(0);
            rpst1.setText(lista_preguntas.get(0).getRespuesta1());
            rpst2.setText(lista_preguntas.get(0).getRespuesta2());
            rpst3.setText(lista_preguntas.get(0).getRespuesta3());
        }else if(lista_preguntas.get(0).getTipo()=="image"){
            rads.setVisibility(View.GONE);
            buts.setVisibility(View.VISIBLE);
            rpst1.setText("");
            rpst2.setText("");
            rpst3.setText("");
            rpst1.setBackgroundDrawable(lista_preguntas.get(0).getRes1());
            rpst2.setBackgroundDrawable(lista_preguntas.get(0).getRes2());
            rpst3.setBackgroundDrawable(lista_preguntas.get(0).getRes3());

        }else if(lista_preguntas.get(0).getTipo()=="radial"){
            buts.setVisibility(View.GONE);
            rads.setVisibility(View.VISIBLE);
            rbut1.setText(lista_preguntas.get(0).getRespuesta1());
            rbut2.setText(lista_preguntas.get(0).getRespuesta2());
            rbut3.setText(lista_preguntas.get(0).getRespuesta3());


        }



        rpst1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (lista_preguntas.get(contadorPreguntas - 1).getSolucion() == 1) {
                    puntos++;
                    MostrarToast("Respuesta correcta");
                } else {
                    MostrarToast("Respuesta incorrecta");
                }
              /*   if(lista_preguntas[contadorPreguntas].getTipo()== "image" || lista_preguntas[contadorPreguntas].getTipo()=="text") {
                    pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                }else if(lista_preguntas[contadorPreguntas].getTipo()=="radial"){
                    NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                }
      */      if(lista_preguntas.size() == contadorPreguntas){
                    if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(0).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }
                }else{


                    if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }}
            }
            });
        rpst2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (lista_preguntas.get(contadorPreguntas - 1).getSolucion() == 2) {
                    puntos++;
                    MostrarToast("Respuesta correcta");
                } else {
                    MostrarToast("Respuesta incorrecta");
                }
             /*   if(lista_preguntas[contadorPreguntas].getTipo()== "image" || lista_preguntas[contadorPreguntas].getTipo()=="text") {
                    pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                }else if(lista_preguntas[contadorPreguntas].getTipo()=="radial"){
                    NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                }
      */      if(lista_preguntas.size() == contadorPreguntas){
                    if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(0).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }
                }else{


                    if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }}
            }
        });
        rpst3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (lista_preguntas.get(contadorPreguntas - 1).getSolucion() == 3) {
                    puntos++;
                    MostrarToast("Respuesta correcta");
                } else {
                    MostrarToast("Respuesta incorrecta");
                }
                if(lista_preguntas.size() == contadorPreguntas){
                    if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(0).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }
                }else{


                    if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }}

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(rbut1.isChecked()==true) {
                    if(lista_preguntas.get(contadorPreguntas-1).getSolucion()==1){
                        puntos++;
                        MostrarToast("Respuesta correcta");
                    }else{
                        MostrarToast("Respuesta incorrecta");
                    }
                    if(lista_preguntas.size() == contadorPreguntas){
                        if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                            pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                        }else if(lista_preguntas.get(0).getTipo()=="radial"){
                            NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                        }
                    }else{


                        if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                            pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                        }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                            NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                        }}

                }else if(rbut2.isChecked()==true){
                    if(lista_preguntas.get(contadorPreguntas-1).getSolucion()==2){
                        puntos++;
                        MostrarToast("Respuesta correcta");
                    }else{
                        MostrarToast("Respuesta incorrecta");
                    }
                    if(lista_preguntas.size() == contadorPreguntas){
                        if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                            pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                        }else if(lista_preguntas.get(0).getTipo()=="radial"){
                            NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                        }
                    }else{


                        if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                            pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                        }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                            NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                        }}

                }else if(rbut3.isChecked()==true){
                    if(lista_preguntas.get(contadorPreguntas-1).getSolucion()==3){
                        puntos++;
                        MostrarToast("Respuesta correcta");
                    }else{
                        MostrarToast("Respuesta incorrecta");
                    }
                    if(lista_preguntas.size() == contadorPreguntas){
                        if(lista_preguntas.get(0).getTipo()== "image" || lista_preguntas.get(0).getTipo()=="text") {
                            pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                        }else if(lista_preguntas.get(0).getTipo()=="radial"){
                            NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                        }
                    }else{


                    if(lista_preguntas.get(contadorPreguntas).getTipo()== "image" || lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                        pasarDePregunta(cntP, prgnt, rpst1, rpst2, rpst3,buts,rads);
                    }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="radial"){
                        NextPregunta(cntP,prgnt,rbut1,rbut2,rbut3,buts,rads);
                    }}
                }else {
                    MostrarToast("Debe contestar a la pregunta");
                }
            }
        });

    }

    private void NextPregunta(TextView cntP, TextView prgnt, RadioButton rbut1, RadioButton rbut2, RadioButton rbut3, LinearLayout buts, LinearLayout rads){


        if(contadorPreguntas==(lista_preguntas.size())) {
            contadorPreguntas = 0;
            Intent i = new Intent(this, PuntosActivity.class);
            i.putExtra("puntos", ((Integer) puntos).toString());
            startActivity(i);
            String texto = "Pregunta "+(contadorPreguntas+1);
            cntP.setText(texto);
            prgnt.setText(lista_preguntas.get(0).getPregunta());
            buts.setVisibility(View.GONE);
            rads.setVisibility(View.VISIBLE);
            rbut1.setText(lista_preguntas.get(0).getRespuesta1());
            rbut2.setText(lista_preguntas.get(0).getRespuesta2());
            rbut3.setText(lista_preguntas.get(0).getRespuesta3());
            contadorPreguntas++;
        }else{
            String texto = "Pregunta "+(contadorPreguntas+1);
            cntP.setText(texto);
        prgnt.setText(lista_preguntas.get(contadorPreguntas).getPregunta());
        buts.setVisibility(View.GONE);
        rads.setVisibility(View.VISIBLE);
        rbut1.setText(lista_preguntas.get(contadorPreguntas).getRespuesta1());
        rbut2.setText(lista_preguntas.get(contadorPreguntas).getRespuesta2());
        rbut3.setText(lista_preguntas.get(contadorPreguntas).getRespuesta3());
        contadorPreguntas++;
    }}
    private void pasarDePregunta(TextView cntP, TextView prgnt, Button rpst1, Button rpst2, Button rpst3, LinearLayout buts, LinearLayout rads){

        rads.setVisibility(View.GONE);
        buts.setVisibility(View.VISIBLE);

        if(contadorPreguntas==(lista_preguntas.size())) {
            Intent i = new Intent(this, PuntosActivity.class);
            i.putExtra("puntos", ((Integer)puntos).toString());
            startActivity(i);
            contadorPreguntas = 0;
            prgnt.setText(lista_preguntas.get(0).getPregunta());
            if(lista_preguntas.get(0).getTipo()=="text") {
                String texto = "Pregunta "+(contadorPreguntas+1);
                cntP.setText(texto);
                rpst1.setBackgroundResource(0);
                rpst2.setBackgroundResource(0);
                rpst3.setBackgroundResource(0);
                rpst1.setText(lista_preguntas.get(0).getRespuesta1());
                rpst2.setText(lista_preguntas.get(0).getRespuesta2());
                rpst3.setText(lista_preguntas.get(0).getRespuesta3());
            }else if(lista_preguntas.get(0).getTipo()=="image"){
                String texto = "Pregunta "+(contadorPreguntas+1);
                cntP.setText(texto);
                rpst1.setText("");
                rpst2.setText("");
                rpst3.setText("");
                rpst1.setBackgroundDrawable(lista_preguntas.get(0).getRes1());
                rpst2.setBackgroundDrawable(lista_preguntas.get(0).getRes2());
                rpst3.setBackgroundDrawable(lista_preguntas.get(0).getRes3());
            }

            contadorPreguntas ++;
            puntos=0;

        }else {
            prgnt.setText(lista_preguntas.get(contadorPreguntas).getPregunta());

            if(lista_preguntas.get(contadorPreguntas).getTipo()=="text") {
                String texto = "Pregunta "+(contadorPreguntas+1);
                cntP.setText(texto);
                rpst1.setBackgroundResource(0);
                rpst2.setBackgroundResource(0);
                rpst3.setBackgroundResource(0);
                rpst1.setText(lista_preguntas.get(contadorPreguntas).getRespuesta1());
                rpst2.setText(lista_preguntas.get(contadorPreguntas).getRespuesta2());
                rpst3.setText(lista_preguntas.get(contadorPreguntas).getRespuesta3());
            }else if(lista_preguntas.get(contadorPreguntas).getTipo()=="image"){
                String texto = "Pregunta "+(contadorPreguntas+1);
                cntP.setText(texto);
                rpst1.setText("");
                rpst2.setText("");
                rpst3.setText("");
                rpst1.setBackgroundDrawable(lista_preguntas.get(contadorPreguntas).getRes1());
                rpst2.setBackgroundDrawable(lista_preguntas.get(contadorPreguntas).getRes2());
                rpst3.setBackgroundDrawable(lista_preguntas.get(contadorPreguntas).getRes3());
        }

            contadorPreguntas++;
        }

    }

    private void MostrarToast(String mag){
        Toast.makeText(getBaseContext(), mag, Toast.LENGTH_SHORT).show();
    }
}
