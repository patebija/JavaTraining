package com.qascript;

public class Audi {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.setColor("red");
        audi.setSize(60);
        audi.setWeight(21.34);
        audi.displayCar();


        Car.accelerate();
        Car.start();

        displayLogo("A");
        displayLogo(100);

    }

    public static void displayLogo(String s1){
        System.out.println("Logo is: " + s1);
    }

    public static void displayLogo(int s){
        System.out.println("Logo is: " + s);
    }
}
