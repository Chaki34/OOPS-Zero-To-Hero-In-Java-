package L9_ObjectClassDemo;

  public class  Employee implements  Cloneable{

    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public  String toString(){

        return "Employee "+id+" "+name;
    }

    // compare object data

    public  boolean equals(Object o){

        if(this  == o){
            return true;
        }

        if(o == null || getClass() != o.getClass() ){
            return  false;

        }

        Employee e = (Employee) o;

        return id == e.id && name.equals(e.name);

    }

    protected Object clone () throws CloneNotSupportedException {

        return  super.clone();

    }

}
