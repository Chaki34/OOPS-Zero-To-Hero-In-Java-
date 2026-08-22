package L8_polymorphysam;


 class  vehicle {

      void strat (){
          System.out.println("strat");
      }

       void start1(){
          System.out.println("start1");
      }
 }

class  car extends  vehicle{


    @Override
    void strat() {
        System.out.println("car start");
        System.out.println("Model : TATA");
    }

    @Override
    void start1() {
        System.out.println("start1 from child ");
    }
}

 class  bike extends  vehicle{


    @Override
    void strat() {
        System.out.println("bike start");
        System.out.println("Model : ZX10R");
    }
}



public class OverridingDemo {
    public static void main(String [] args){

        vehicle obj = new car();

        vehicle obj2 = new vehicle();
        obj2.strat();

        obj.strat();
        obj.strat();

        bike b = new bike();

        b.strat();

        car c = new car();
        c.strat();
        c.start1();








    }
}
