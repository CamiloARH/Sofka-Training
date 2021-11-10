package com.sofka.project;
import java.io.*;
import java.util.Locale;

public class VarTexto {
    public static void main(String[] args) {
        String texto = "";
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        int x = 0;
        try{
            texto = buffer.readLine();
            x = Integer.parseInt(texto);/* Convierte un texto en numero */
            texto = String.valueOf(x); /* Convierte un numero en texto */

        }catch (Exception e){
            System.out.println("Debes ecribir un numero");
        };
          System.out.println(x+5);
          System.out.println(texto + 5);
//        texto = texto.concat("- Esto Es Una Concatenacion");
//        System.out.println(texto);
//        texto = texto.toLowerCase();
//        System.out.println(texto);
//        texto = texto.toUpperCase();
//        System.out.println(texto);
//        System.out.println(texto.length());
    }
}
