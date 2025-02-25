package com.reto.animales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.reto.animales.services.AnimalAcciones;
import com.reto.animales.interfaces.IAnimalAcciones;

@Configuration
@ComponentScan(basePackages = "com.reto.animales")
public class AppConfig {

    @Bean
    public IAnimalAcciones animalService() {
        return (IAnimalAcciones) new AnimalAcciones();
    }
}
