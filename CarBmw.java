package com.sofka.project;

public class CarBmw extends Car{

    //  Class aparte, pero hereda lo de la funcion anterior Car
    public CarBmw(){
        super(5,6,8);
        this.setModelo("BMW");
    }

    public void turbo(){
        System.out.println("Acabas de viajar a 250 km/h");
    }

    // para mirar el polimorfismo

    @Override
    public void info(){
        System.out.println("Este es un carro BMW");
    }
}
