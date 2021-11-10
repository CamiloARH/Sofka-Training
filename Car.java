package com.sofka.project;

public class Car {
    // variables nativas de la clase
    private double peso;
    private double altura;
    private double ancho;
    private double largo;
    private int numeroPuertas;
    private String modelo;
    private String color;
    private boolean encendido = false;

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

    public Car(double peso) {
        this.peso = peso;
    }

    public Car(double altura, double ancho, double largo) {
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}

  //  Class aparte, pero hereda lo de la funcion anterior Car
class CarBMW extends Car{
    public CarBMW(){
        this.setModelo("BMW");
    }
    public void turbo(){
        System.out.println("Acabas de viajar a 250 km/h");
    }
      // para mirar el polimorfismo
      public void info(){
          System.out.println("Este es un carro BMW");
      }
  }