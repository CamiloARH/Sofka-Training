package com.sofka.project;

import javax.swing.*;


public class HelloWord {
    public static void main(String[] args) {
//        System.out.println("Hello Word");

//         Para imprimir, y pedir datos desde la consola
//        Scanner capture = new Scanner(System.in);
//        System.out.println("Ingrese un Dato: ");
//        String data = capture.nextLine();
//        System.out.println("El dato es: " + data);


//         Para imprimir, y pedir datos desde un mensaje emergente
//        String data;
//        data = JOptionPane.showInputDialog(" Ingrese un Dato: ");
//        JOptionPane.showMessageDialog(null, "El Dato ingresado es: " + data);
//

//        Un hibrido puede ser este:
        String data;
        data = JOptionPane.showInputDialog(" Ingrese un Dato: ");
        System.out.println("El dato que se ingreso es: " + data);

    }

}
