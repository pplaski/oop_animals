package com.paanimals.app.Model.Mammal;

public class Human extends Mammal{
    public Human(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "2 legs";
    }

}
