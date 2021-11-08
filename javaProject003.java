package com.sofka.project;

import java.util.Scanner;
public class javaProject003 {
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        System.out.println("Digite 4 numeros: ");
        String number = capture.nextLine();

        String number1 = number.substring(3, 4);
        Integer number01 = Integer.parseInt(number1);
        Integer number02 = Integer.parseInt(number.substring(2, 3));
        Integer number03 = Integer.parseInt(number.substring(1, 2));
        Integer number04 = Integer.parseInt(number.substring(0, 1));
        Integer sum = number01 + number02 + number03 + number04;
        String number_inv = number1 + number02 + number03 + number04;
        System.out.println("la suma de los numeros digitados es : " + sum);
        System.out.println("El numero invertido es: " + number_inv);

    }
}