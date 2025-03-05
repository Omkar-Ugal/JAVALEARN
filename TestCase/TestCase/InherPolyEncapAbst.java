package TestCase;
// Inheritance and Polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method Overriding (Polymorphism)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method Overriding (Polymorphism)
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class InherPolyEncapAbst {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Dog is a type of Animal
        Animal myCat = new Cat();  // Cat is a type of Animal

        myDog.sound();  // Dog barks
        myCat.sound();  // Cat meows
    }
}
