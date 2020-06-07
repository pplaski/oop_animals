package com.paanimals.app.Model.Fish;

import com.paanimals.app.Model.Animal;

public abstract class Fish extends Animal {
    public Fish(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breath with gill";
    }
}
