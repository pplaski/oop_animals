package com.paanimals.app.Model.Mammal;

import com.paanimals.app.Model.Animal;

public abstract class Mammal extends Animal {
    public Mammal(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breathe with lungs";
    }
}
