package L5_Inheritance.MultipleInheritance.MultipleInheritanceDemo;

 abstract class  Person {

    String name;

    Person(String name){
        this.name=name;
    }

    void Display(){
        System.out.println("info of the person "+name);
    }
}


interface Employee{

    void work();
    void coding();
}

interface trainer{

    void  train();
    void  teaching();
}


class  Teacher extends Person implements Employee, trainer{


    Teacher(String name){
       super(name);
    }

    @Override
    public void work() {

        System.out.println("Woking In teaching "+name);

    }

    @Override
    public void coding() {

    }

    @Override
    public void train() {
       System.out.println("Name of the teacher who train us  "+name);
    }

    @Override
    public void teaching() {

        System.out.println("Name of the teacher who teach us  "+name);

    }

    void  salary(){
        System.out.println("Salary of teacher 80000");
    }
}



public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Debmalya");

        t.work();
        t.teaching();
        t.coding();

        t.Display();


        Person p = new Teacher("Deb");
        p.Display();

        Employee e = new Teacher("XYZ");
        e.work();
        e.coding();



    }
}
