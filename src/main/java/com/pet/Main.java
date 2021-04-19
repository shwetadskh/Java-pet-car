package com.pet;

public class Main {
    public static void main(String[] args) {

        Car c1=new Car("toyota" ,"Camry",2010);
        String fast=c1.toString();
        System.out.println(fast);
        boolean val= c1.isNewCar();
        System.out.println("value: " +val);
    }
}
