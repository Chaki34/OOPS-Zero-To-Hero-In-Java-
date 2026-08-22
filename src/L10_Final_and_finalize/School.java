package L10_Final_and_finalize;

public  class  School {

    final  int  regNo = 12345678;

    public int getRegNo() {
        return regNo;
    }


    // finalize

    protected void finalize () throws Exception{

        System.out.println("finalize block executed");


    }










}
