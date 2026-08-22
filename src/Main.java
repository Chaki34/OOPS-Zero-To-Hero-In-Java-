import L1_Classes_Objects.EmptyClass;
import L1_Classes_Objects.Human;
import L2_Constructors.Book;
import L2_Constructors.Dog;
import L2_Constructors.User;


class XYZ {

    // private cons

    private XYZ(){
        System.out.println("private calling  by XYZ");
    }


    public static  void  Disply(){
        System.out.println("dispalying by XYZ");
    }


}


public class Main {
    public static void main (String  [] args){

        // object creation

        // <Class Name> object name  = new <class name>();

        Human ram = new Human(); // obj1

        Human  rahim  = new Human (); // obj2

        ram.setData("Debmalya",22,"kol",'M');
        ram.Display();

        rahim.setData("Rahim",23,"MUM",'M');
        rahim.Display();

        rahim.talk();

        System.out.println(ram.getClass());






//        EmptyClass empty = new EmptyClass();
//
//        System.out.println(ram.getClass().getName());
//
//        // check type od the obj
//
//        System.out.println(ram instanceof Human);
//
//        System.out.println(empty instanceof EmptyClass );


        Book books = new Book();

        System.out.println(books.getClass().getName());

        books.Print();

        Book b1 = new Book("ABC","jack",124.56,720);
        b1.Display();

        Book b2 = new Book("XZY","ABC");
        b2.Display();

        Book books1 = new Book();
        Book newBook = new Book(b2); // copy the b1 into newBook obj
        newBook.Display();


        // XYZ xyz = new XYZ();

        XYZ.Disply();


        // constructor chaining

        User u1 = new User(); // default

        u1.display();

        System.out.println();

        User u2 = new User("Debmalya");
        u2.display();

        System.out.println();

        User u3 = new User("Debmalya","debmalya1234@gmail.com");
        u3.display();


        User u4 = new User("Durga","Durga123@gmail.com","ADMIN");
        u4.display();

        System.out.println();

        Dog d =  new Dog();

    }

}
