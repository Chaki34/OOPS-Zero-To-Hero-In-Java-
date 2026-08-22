package L5_Inheritance.MultipleInheritance.Diamond_problem;

// =========================================
// Diamond Problem (Concept Only)
// This code will NOT compile in Java.
// Java does not support multiple inheritance
// with classes because of this ambiguity.
// =========================================

class Animal {

    void soundinfo() {
        System.out.println("Animal Sound");
    }
}

interface Dog  {


    default  void sound() {
        System.out.println("Dog Barks");
    }
}

interface Cat {


    default  void sound() {
        System.out.println("Cat Meows");
    }
}


class Puppy extends Animal implements Dog,Cat {

    @Override
    public void sound() {
        Dog.super.sound();
    }
}

public class Main {

    public static void main(String[] args) {

         Puppy p = new Puppy();
        p.sound();

        p.soundinfo();
    }
}


