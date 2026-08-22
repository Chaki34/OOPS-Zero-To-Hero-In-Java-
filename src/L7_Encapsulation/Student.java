package L7_Encapsulation;

import java.util.Random;

// pojo class
public class Student {

    private  int  id;
  private  String name;
   private  String  dept;


   public  Student (){

       Random rand = new Random();

       this.id = 1000 + rand.nextInt(9000);  // 1000 - 9999

   }

   // Getters And Setters

    public  int  getId(){
       return id;
    }

    public  void setName(String name ){
       this.name  = name;
    }

    public  String  getName(){
       return  name;
    }

    public  void setDept(String dept){
       this.dept  = dept;
    }

    public  String  getDept(){
       return  dept;
    }

}
