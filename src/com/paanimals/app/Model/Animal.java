package com.paanimals.app.Model;

public abstract class Animal {
    protected String name;
    protected double mass;

    public Animal(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    public abstract String move();
    public abstract String breath();

    public String getName() { return name; }
    public double getMass() { return mass; }
}