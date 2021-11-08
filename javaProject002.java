package com.sofka.project;

import java.util.Scanner;
public class javaProject002 {
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        System.out.println("Digite una cantidad de numeros: ");
        String number = capture.nextLine();
        Integer sum = 0;
        String number2 = "";

        for (int i = 0; i < number.length(); i++) {
            String numberi = number.substring(i, i + 1);
            sum = sum + Integer.parseInt(numberi);
        }
        System.out.println("la suma de los numeros digitados es : " +sum);

        for (int i = 0; i < number.length(); i++) {
            String numberi = number.substring(i, i + 1);
            number2 = numberi + number2;
            }
        System.out.println("El numero invertido es: "+number2);
    }
}