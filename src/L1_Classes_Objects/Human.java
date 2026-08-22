package L1_Classes_Objects;

 public class Human {

    // data fields

    String  name;
    int  age ;
    String city;
    char  gender;





    // methods
     public  void  setData (String n,int a , String c , char g){
        name  = n;
        age = a;
        city = c;
        gender = g;

    }

    public  void  Display (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
    }


    // talk

    public  void  talk (){
        System.out.println("Human talking");
    }


}
