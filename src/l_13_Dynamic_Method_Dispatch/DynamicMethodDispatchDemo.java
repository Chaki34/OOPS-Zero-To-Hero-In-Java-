package l_13_Dynamic_Method_Dispatch;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
         super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String [] args){

        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();





    }
}
