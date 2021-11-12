package com.sofka.project;

import java.util.*;

public class Estudio {
    public void ordenar(){
        List<String> lista = new ArrayList<>();
        lista.add("Juegos");
        lista.add("Camilo");
        lista.add("Libros");

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elmento : lista){
            System.out.println(elmento);
        }

    }


    public static void main(String[] args) {

    }
}
