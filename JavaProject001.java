package com.sofka.project;

import java.util.Scanner;

public class JavaProject001 {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese los siguientes datos: ");

//        main Data

        System.out.println("Nombre: ");
        String name = capture.nextLine();
        System.out.println("Numero Celular: ");
        String cellphone = capture.nextLine();
        System.out.println("Edad: ");
        String age = capture.nextLine();

//           Datos de validacion.

//        String name = "Oscar Lopera";
//        Integer cellphone = 3056984587;
//        Integer age = 29;

//        Comprobar Genero

        System.out.println("Genero: M/F");
        String gender = capture.nextLine();

        if (gender.equals("m") || gender.equals("M")){
        System.out.println("Bienvenido Señor " + name + ", es un placer para nosotros contar con una persona de " + age + " años. \n" +
                "Próximamente nos comunicaremos con usted al numero " + cellphone + ".\nFeliz día.");

        } else if (gender.equals("f") || gender.equals("F")){
            System.out.println("Bienvenido Señora " + name + ", es un placer para nosotros contar con una persona de " + age + " años. \n" +
                    "Próximamente nos comunicaremos con usted al numero " + cellphone + ".\nFeliz día.");
        } else {
        System.out.println("Bienvenido Señ@r " + name + ", es un placer para nosotros contar con una persona de " + age + " años. \n" +
                "Próximamente nos comunicaremos con usted al numero " + cellphone + ".\nFeliz día.");
        }
    }
}
