package com.paanimals.app;

import com.paanimals.app.Model.Bird.Raven;
import com.paanimals.app.Model.Fish.Piranha;
import com.paanimals.app.Model.Mammal.Human;
import com.paanimals.app.Model.Mammal.Lion;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Przemek", 80.5);
        Lion lion = new Lion("Mufasa", 70.5);
        Piranha piranha = new Piranha("Nemo", 2.3);
        Raven raven = new Raven("Krukru", 15.2);

        System.out.println("Human " + human.getName() + " move by " + human.move());
        System.out.println("Human " + human.getName() + " " + human.breath());
        System.out.println("Lion " + lion.getName() + " move with " + lion.move());
        System.out.println("Lion " + lion.getName() + " " + lion.breath());
        System.out.println("Fish " + piranha.getName() + " move by " + piranha.move());
        System.out.println("Fish " + piranha.getName() + " " + piranha.breath());
        System.out.println("Bird " + raven.getName() + " move by " + raven.move());
        System.out.println("Bird " + raven.getName() + " " + raven.breath());
    }
}
