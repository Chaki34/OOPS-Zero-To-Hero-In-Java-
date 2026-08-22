package L10_Final_and_finalize;


import L9_ObjectClassDemo.Employee;

public class Main {
    public static void main(String [] args){

        School s = new School();
        School s1 = new School();



        System.out.println(s.regNo);




        int  s2 = s.getRegNo();
        System.out.println(s2);

        s1 = null; // garbage collector

        System.gc();

        System.out.println("program ended");


        Employee e = new Employee(10,"deb");
        System.out.println(e.toString());


    }
}
