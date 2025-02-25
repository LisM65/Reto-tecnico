package com.reto.animales.interfaces;

import com.reto.animales.models.Animal;

import java.util.List;
import java.util.Map;

public interface IAnimalAcciones {
    Map<String, List<Animal>> agruparPorTipo(List<Animal> animales);
    void imprimirAnimales(List<Animal> animales);
}
