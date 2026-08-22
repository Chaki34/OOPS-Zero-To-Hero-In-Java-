package L5_Inheritance.SingleInheritance;


// parent  class
class  Person {

    String name;
    String age;




    Person (String name, String age){
        this.name = name;
        this.age = age;
    }


    void Display(){
        System.out.println("From Parent class  : "+name);
        System.out.println("From Parent Class: "+age);
    }

}

// child class

class  Student extends Person{

    int rollNo;

    Student(String name , String age, int rollNo){

        super(name,age);
        this.rollNo = rollNo;
    }

    void  StudentInfo(){
        System.out.println("Student Info : "+rollNo);
    }

    Student getStudent(){
        System.out.println("Student getStudent : "+rollNo);
        return  this;
    }

}




public class Mian {
    public static void main(String [] args){

        Student student = new Student("Debmalya","22",123456);
        student.Display();
        student.StudentInfo();

        System.out.println();

        Student student1 = new Student("Deb","12",123453);
        student1.Display();


        Student  s1 = student1.getStudent();

        s1.StudentInfo();

        System.out.println();


        s1.getStudent().Display();








    }
}
