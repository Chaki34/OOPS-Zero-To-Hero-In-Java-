package L7_Encapsulation;


public class EncapsulationDemo {

    public static void main(String  [] agrs){

        Student student = new Student();



        System.out.println("ID for Student : "+student.getId());
        student.setName("Debmalya chaki");
        System.out.println("Name for Student : "+student.getName());

        student.setDept("CSE");
        System.out.println("Dept for Student : "+student.getDept());

    }
}
