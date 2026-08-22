package L9_ObjectClassDemo;


public class ObjectClassDemo {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee(1,"John");
        Employee e3 = new Employee(1,"John");

        Employee e2 = new Employee(2,"jack");


        String  s = e1.toString();
        System.out.println(s);

        boolean  b = e1.equals(e3);
        System.out.println(b);


        Employee obj = (Employee) e2.clone();


        System.out.println(obj);

        System.out.println(e2.getClass().getSimpleName().equals(obj.getClass().getSimpleName()));
        System.out.println(e3.hashCode());



    }
}
