package L5_Inheritance.SingleInheritance.Multilevel_and_hierarchical;


// super class

class person {


}


// parent class  & child  for person

class  Employee extends  person{


}


// child class
class  Manager extends person{



}




public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        Employee e = new Employee();

        person p = new person();

        System.out.println(m.getClass().getSimpleName());

        System.out.println(m instanceof Manager);

        System.out.println(m instanceof  person);

        System.out.println(e instanceof Employee);

        System.out.println(m instanceof Object);


        System.out.println(e.getClass().getSimpleName());
        System.out.println(p.getClass().getSimpleName());



    }
}
