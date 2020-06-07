package com.paanimals.app.Model.Bird;

import com.paanimals.app.Model.Animal;

public abstract class Bird extends Animal {
    public Bird(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breath with lungs";
    }
}