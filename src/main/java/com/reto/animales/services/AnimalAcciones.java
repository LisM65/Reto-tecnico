package com.reto.animales.services;

import org.springframework.stereotype.Service;
import com.reto.animales.interfaces.IAnimalAcciones;
import com.reto.animales.models.Animal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnimalAcciones implements IAnimalAcciones {
    @Override
    public Map<String, List<Animal>> agruparPorTipo(List<Animal> animales) {
        return animales.stream()
                .collect(Collectors.groupingBy(Animal -> Animal.getTipo().name()));
    }

    @Override
    public void imprimirAnimales(List<Animal> animales) {
        Map<String, List<Animal>> agrupados = agruparPorTipo(animales);

        agrupados.forEach((tipo, lista) -> {
            System.out.println("************************************************\n" +
                    "Animales " + tipo + ":");
            lista.forEach(animal -> System.out.println(animal));
            System.out.println("************************************************\n");
        });
    }
}
