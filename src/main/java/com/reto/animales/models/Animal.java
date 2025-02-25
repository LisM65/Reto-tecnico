package com.reto.animales.models;

import com.reto.animales.interfaces.IAnimal;

public class Animal implements IAnimal {
    private String nombre;
    private TipoAnimal tipo;
    private String sonido;

    public Animal(String nombre, String tipo, String sonido) {
        this.nombre = nombre;
        this.tipo = TipoAnimal.ConvertirTexto(tipo);
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String emitirSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "   Nombre del animal:" + nombre + "\n   Tipo:" + tipo + "\n   Sonido: " + sonido + "\n";
    }
}
