package com.paanimals.app.Model.Fish;

public class Piranha extends Fish{
    public Piranha(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "plum arrghhh plum";
    }

}
