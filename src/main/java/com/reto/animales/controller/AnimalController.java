package com.reto.animales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.reto.animales.interfaces.IAnimalAcciones;
import com.reto.animales.models.Animal;
import java.util.List;

@Controller
public class AnimalController {
    private final IAnimalAcciones animalService;

    @Autowired
    public AnimalController(IAnimalAcciones animalService) {

        this.animalService = animalService;
    }

    public void procesarAnimales(List<Animal> animales) {

        animalService.imprimirAnimales(animales);
    }
}
