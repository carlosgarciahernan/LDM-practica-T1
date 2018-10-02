package com.example.carlo.juegoconinterfacesdeusuario;

import android.graphics.drawable.Drawable;

public class PreguntaQuiz {
    private String tipo; //text or image
    private String pregunta;
    private String imagen;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private Drawable res1;
    private Drawable res2;
    private Drawable res3;
    private int solucion;


    public PreguntaQuiz(){
        this.pregunta = pregunta;
        this.imagen = imagen;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.solucion = solucion;
        this.tipo = tipo;
    }

    public PreguntaQuiz(String pregunta, String respuesta1, String respuesta2, String respuesta3, int solucion,String tipo){
        this.pregunta = pregunta;
        this.imagen = "0";
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.solucion = solucion;
        this.tipo = tipo;
    }
    public PreguntaQuiz(String pregunta,Drawable res1,Drawable res2, Drawable res3,int solucion, String tipo){
        this.pregunta = pregunta;
        this.imagen = "0";
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.solucion = solucion;
        this.tipo = tipo;
    }

    public String getTipo(){return tipo;}

    public String getImagen() {
        return imagen;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public Drawable getRes1() {
        return res1;
    }

    public Drawable getRes2() {
        return res2;
    }

    public Drawable getRes3() {
        return res3;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public int getSolucion(){
        return this.solucion;
    }

    public void setSolucion(int solucion){
        this.solucion=solucion;
    }
}
