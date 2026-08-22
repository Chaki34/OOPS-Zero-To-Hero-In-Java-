package L2_Constructors;

// child
public  class Dog extends Animal{

    public Dog(){
        this("labrador");
    }

    public  Dog (String breed){

        super("Mammal");

        System.out.println("Dog constructor and the breed is " + breed);

    }

}