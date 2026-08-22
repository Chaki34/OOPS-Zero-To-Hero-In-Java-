package L_12_Marker_Interface;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Marker Interfaces (Java 1.0 / 1.1): These are as old as Java itself.
 * Classic marker interfaces like java.io.Serializable (introduced in Java 1.1)
 * and java.lang.Cloneable (introduced in Java 1.0) existed long before Java 8.
 */


class Student implements Serializable {

    int  id;
    String name ;

    public Student(int id,String name) {
        this.id = id;
        this.name=name;
    }



}

public class MarkerInterfaceDemo {

    public static void main(String [] args) throws Exception{

        Student s = new Student(101,"Debmalya");

        ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("Student.txt"));

        out.writeObject(s);

        out.close();


    }
}
