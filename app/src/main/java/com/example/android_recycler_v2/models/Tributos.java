package com.example.android_recycler_v2.models;

public class Tributos {
    private String nombre;
    private int edad;
    private String genero;
    private String alias;
    private Distrito distrito;

    public Tributos(String nombre, int edad, String genero, String alias, Distrito distrito) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.alias = alias;
        this.distrito = distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
