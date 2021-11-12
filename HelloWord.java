package com.sofka.project;

import javax.swing.*;
import com.sofka.project.Car;


public class HelloWord {
    public static void main(String[] args) {
//        System.out.println("Hello Word");

//           Para imprimir, y pedir datos desde la consola
//        Scanner capture = new Scanner(System.in);
//        System.out.println("Ingrese un Dato: ");
//        String data = capture.nextLine();
//        System.out.println("El dato es: " + data);


//          Para imprimir, y pedir datos desde un mensaje emergente
//        String data;
//        data = JOptionPane.showInputDialog(" Ingrese un Dato: ");
//        JOptionPane.showMessageDialog(null, "El Dato ingresado es: " + data);
//

//          Un hibrido puede ser este:
//        String data;
//        data = JOptionPane.showInputDialog(" Ingrese un Dato: ");
//        System.out.println("El dato que se ingreso es: " + data);

        CarBmw c = new CarBmw();
        Car a = new Car();
//        Car b = new Car(120,12,3,5,"red",4,"no se",false);
        Car b = new Car(120,5,8);
        c.status();
        c.starTheCar();
        System.out.println(c.obtenerPeso());
        c.status();
        c.offTheCar();
        System.out.println(b.obtenerPeso());
        b.status();
        c.turbo();
        b.info();
        c.info();
        b.setModelo("Mazda");
        System.out.println(b.getModelo());


    }

}
