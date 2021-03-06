package com.example.flowers;

import android.widget.ImageView;

public class flor {

    private ImageView imagen;
    private ImageView nombre;
    private String descripcion;
    private String luzInfo;
    private String aguaInfo;
    private String ubicación;
    private String color;
    private int dificultad;

    public flor(ImageView imagen, ImageView nombre, String descripcion, String luzInfo, String aguaInfo, String ubicación, String color, int dificultad) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.luzInfo = luzInfo;
        this.aguaInfo = aguaInfo;
        this.ubicación = ubicación;
        this.color = color;
        this.dificultad = dificultad;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public ImageView getNombre() {
        return nombre;
    }

    public void setNombre(ImageView nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLuzInfo() {
        return luzInfo;
    }

    public void setLuzInfo(String luzInfo) {
        this.luzInfo = luzInfo;
    }

    public String getAguaInfo() {
        return aguaInfo;
    }

    public void setAguaInfo(String aguaInfo) {
        this.aguaInfo = aguaInfo;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}
