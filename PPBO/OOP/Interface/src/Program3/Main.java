package Program3;

abstract class Animal{
    abstract void makeSound();
}

abstract class Mammal extends Animal {
    abstract void move();
}

class Dog extends Mammal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    void move(){
        System.out.println("Dog runs");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.move();
    }
}
