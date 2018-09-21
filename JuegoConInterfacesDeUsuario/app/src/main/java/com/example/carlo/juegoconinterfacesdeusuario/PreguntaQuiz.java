package com.example.carlo.juegoconinterfacesdeusuario;

public class PreguntaQuiz {

    private String pregunta;
    private String imagen;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;


    public PreguntaQuiz(String pregunta, String imagen, String respuesta1, String respuesta2, String respuesta3){
        this.pregunta = pregunta;
        this.imagen = imagen;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
    }

    public PreguntaQuiz(String pregunta, String respuesta1, String respuesta2, String respuesta3){
        this.pregunta = pregunta;
        this.imagen = "0";
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
    }

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

}
