package Inheretence_animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        for(String arg : args) {
            Animal animal = createAnimal(arg);
            if(animal != null) {
                animals.add(animal);
            }
        }

        for(Animal animal : animals) {
            animal.makeSound();
        }

    }

    private static Animal createAnimal(String arg) {
        switch (arg) {
            case "C":
            case "c":
                return new Cat();
            case "D":
            case "d":
                return new Dog();
        }
        return null;
    }
}
