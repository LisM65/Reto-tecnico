package com.reto.animales;

import com.reto.animales.models.TipoAnimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.reto.animales.config.AppConfig;
import com.reto.animales.controller.AnimalController;
import com.reto.animales.models.Animal;
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalController controller = context.getBean(AnimalController.class);
        Scanner teclado = new Scanner(System.in);


        List<Animal> animales = new ArrayList<>();
        System.out.println("Ingrese animales:");
        ;

        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Ingrese animal                                
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    String nombre = teclado.nextLine();
                    String tipoIns = teclado.nextLine();
                    TipoAnimal tipo;

                    String sonido = teclado.nextLine();

                    animales.add(new Animal(nombre, tipoIns, sonido));

                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        teclado.close();

        controller.procesarAnimales(animales);
    }
}