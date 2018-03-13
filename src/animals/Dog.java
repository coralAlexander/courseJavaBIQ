package animals;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Howhow");
    }
}
