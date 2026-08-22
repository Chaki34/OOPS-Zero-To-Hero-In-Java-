package L3_static_keyward;

 class College {

     static  String collegename = "PCMT"; // use for each student

     static String reg = "PCMT123";


     static{

         System.out.println("College info Loaded...");

     }


     static  void display(){
         System.out.println("College name is  :"+collegename);
         System.out.println("reg is  :"+reg);
     }


     // inner class

     static class Student{

         int rollNo;
         String name;
         String dept;

         Student(int rollNo, String name, String dept){
             this.rollNo = rollNo;
             this.name = name;
             this.dept = dept;
         }

         void Display(){
             System.out.println("Student name is  :"+name);
             System.out.println("Student roll no is  :"+rollNo);
             System.out.println("Student dept is  :"+dept);
         }
     }


}
