package com.paanimals.app.Model.Bird;

public class Raven extends Bird{
    public Raven(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "Fru fru!";
    }

}
