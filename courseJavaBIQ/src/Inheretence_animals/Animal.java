package Inheretence_animals;

abstract public class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }

    abstract public void makeSound();


}
