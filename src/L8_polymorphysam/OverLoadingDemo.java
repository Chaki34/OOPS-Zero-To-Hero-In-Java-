package L8_polymorphysam;


class  Calculater{

    // add

    void  add(){
        System.out.println("Add Method");
    }

    void  add (int a, int  b){
        System.out.println("Add Method "+(a+b));
    }

    void  add (double a  ,  int c, double b ){
        System.out.println("Add Method "+(a+b+c));
    }

    void  add (double a,  double  b, int  c) {
        System.out.println("Add Method "+(a+b+c));
    }

    void  name (String name , int age){
        System.out.println("Name for Student : "+name+" and "+age);
    }

    void  name (int age ,String name ){
        System.out.println("Name for Student from name v2 : "+name+" and "+age);
    }


}

public class OverLoadingDemo {

    public static void main(String [] args){

        Calculater c = new Calculater();

        c.add();
        c.add(1,30);
        c.add(10.0,20, 30.0);
        c.add(12.45,10.43,10);

        c.name(10,"Debmalya");
        c.name("deb",10);

    }
}
