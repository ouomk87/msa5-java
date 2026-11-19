package org.example.e06oop.interfaceedu;

public class Maininterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        System.out.println(flyingFish.flying());

        Whale whale = new Whale();
        System.out.println(whale.residence());

        Fish fish = new FlyingFish();
        Flight flight = new FlyingFish();
        Swim swim = new FlyingFish();
    }
}
