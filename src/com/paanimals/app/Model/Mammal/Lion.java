package com.paanimals.app.Model.Mammal;

public class Lion extends Mammal{
    public Lion(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "4 legs";
    }

}
