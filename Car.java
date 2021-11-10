package com.sofka.project;

public class Car {
    // variables nativas de la clase
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuertas;
    String modelo;
    String color;
    boolean encendido = false;

    //constructores

    public Car() {
        this.peso = 10000;
        this.altura = 1.90;
        this.ancho = 2;
        this.largo = 4;
        this.color = "Negro";
        this.numeroPuertas = 5;
        this.modelo = "Camaro";
    }
    public Car(double peso, double altura, double ancho, double largo, String color, int numeroPuertas, String modelo,
               boolean encendido) {
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
        this.encendido = encendido;
    }

    // Metodos

    public double obtenerPeso(){
        return this.peso;
    }
    public void  starTheCar(){
        this.encendido = true;
        System.out.println("Acabas de prender el carro");
    }
    public void  offTheCar(){
        this.encendido = false;
        System.out.println("Acabas de apagar el carro");
    }
    public void status(){

        if (this.encendido==true){
            System.out.println("El carro esta encendido");
        } else {
            System.out.println("El carro esta apagado");
        }
    }
    // para mirar el polimorfismo
    public void info(){
        System.out.println("Este es un carro");
    }
}

  //  Class aparte, pero hereda lo de la funcion anterior Car
class CarBMW extends Car{
    public CarBMW(){
        this.modelo="BMW";
    }
    public void turbo(){
        System.out.println("Acabas de viajar a 250 km/h");
    }
      // para mirar el polimorfismo
      public void info(){
          System.out.println("Este es un carro BMW");
      }
  }