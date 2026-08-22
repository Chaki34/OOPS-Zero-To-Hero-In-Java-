package L6_Abstraction;

interface Remote {

    void powerBtn();

    default  void  muteBtn(){
        System.out.println("TV muted");
    }
}


abstract class Television implements Remote {

    public  abstract void  powerBtn();


    protected void checkBattery(){
        System.out.println("OK");
    }
    protected  void  sendSignal(){
        System.out.println("TV send signal");
    }

    protected  void  receivedSignal(){
        System.out.println("TV  signal received");
    }

    protected void  ShowLogo(){
        System.out.println("TV logo");
    }

    protected  void  showStatus(){
        System.out.println("TV ON");
    }


}


class  LGtv extends  Television{

    @Override
    public void powerBtn() {
        System.out.println("LG pow ON");

        checkBattery();
        sendSignal();
        receivedSignal();
        ShowLogo();
        showStatus();
    }
}




public class Main {

    public static void main(String  [] args){

        LGtv lgtv = new LGtv();

        lgtv.powerBtn();

        lgtv.muteBtn();

        lgtv.checkBattery();




    }
}
