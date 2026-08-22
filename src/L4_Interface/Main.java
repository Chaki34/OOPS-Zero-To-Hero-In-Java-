package L4_Interface;


// interface <interface name>

interface vehicle{

    // public  static  final  by default
    int MAX_SPEED = 120;


    // Abstracts methods
    //public abstract by default
    void start();
    void stop();

    void  rooftop();


    // default

    default  void  fuelType(){
        System.out.println("Fuel Type:petrol");
    }

    // static

    static  void  comName(){
        System.out.println("ComName:TATA");
    }



}


class Car implements vehicle{

    @Override
     public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void rooftop() {

    }
}


abstract class Truck implements vehicle{

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void rooftop() {
        System.out.println("Truck has no rooftop");
    }


    static void print(){
        System.out.println("Hello from truck class ");
    }



}


class  Nexon extends Truck {

    @Override
    public void start() {
       System.out.println("Nexon start");
    }

    @Override
    public void stop() {
        System.out.println("Nexon stop");
    }

    void  Display(){
        System.out.println("Nexon show truck class ");
    }


}

public class Main {
    public static void main(String [] args){

        System.out.println(vehicle.MAX_SPEED);

        vehicle.comName();

        Car car = new Car();

        car.start();
        car.fuelType();
        car.stop();
        car.rooftop();

        System.out.println();


        Nexon nex = new Nexon();

        nex.start();
        nex.stop();
        nex.rooftop();
        nex.Display();

        vehicle nex1 = new Nexon();

        nex1.start();
        nex1.fuelType();
        nex1.stop();
        nex1.rooftop();













    }
}
