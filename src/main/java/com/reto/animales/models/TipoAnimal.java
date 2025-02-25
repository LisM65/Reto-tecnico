package com.reto.animales.models;

public enum TipoAnimal {
    TERRESTRE,
    VOLADOR,
    ACUATICO;

    public static TipoAnimal ConvertirTexto(String tipo) {
        try {
            return TipoAnimal.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de animal desconocido: " + tipo);
            return null;  // O puedes manejarlo de otra manera
        }
    }

    public static TipoAnimal fromString(String tipo) {
        for (TipoAnimal tipoAnimal : TipoAnimal.values()) {
            if (tipoAnimal.name().equalsIgnoreCase(tipo)) {
                return tipoAnimal;
            }
        }
        throw new IllegalArgumentException("Tipo de animal " + tipo + " no encontrado");
    }

}
