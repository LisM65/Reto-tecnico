package com.reto.animales;

import com.reto.animales.controller.AnimalController;
import com.reto.animales.models.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AnimalesTest {

    private AnimalController controllerMock;
    private List<Animal> animales;

    @BeforeEach
    void setUp() {
        // Mock del controlador
        controllerMock = mock(AnimalController.class);
        animales = new ArrayList<>();
    }

    @Test
    void testCrearAnimal() {
        // Crear un animal manualmente
        Animal animal = new Animal("Perro", "terrestre", "guau");

        animales.add(animal);

        assertEquals(1, animales.size());
        assertEquals("Perro", animales.get(0).getNombre());
        assertEquals("terrestre", animales.get(0).getTipo().ToString());
        assertEquals("guau", animales.get(0).emitirSonido());
    }

    @Test
    void testProcesarAnimales() {
        // Agregar animales a la lista
        animales.add(new Animal("Gato", "terrestre", "miau"));
        animales.add(new Animal("Águila", "volador", "kree"));
        animales.add(new Animal("Gato", "terrestre", "miau"));
        animales.add(new Animal("Pato", "volador", "cuac"));
        animales.add(new Animal("pez", "acuatico", "glup"));
        animales.add(new Animal("abeja", "volador", "bzzzzz"));


        controllerMock.procesarAnimales(animales);

        verify(controllerMock, times(1)).procesarAnimales(animales);
    }
}
