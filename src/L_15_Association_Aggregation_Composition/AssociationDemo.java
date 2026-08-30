package L_15_Association_Aggregation_Composition;

// ============================================================
// ASSOCIATION
// Definition:
// Association means a general "uses/knows" relationship
// between two independent classes.
//
// Identification:
// If both objects can exist independently → Association.
// Example: Teacher and Student
// ============================================================

class Teacher {

    void teach(Student student) {
        System.out.println("Teacher is teaching " + student.name);
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}


public class AssociationDemo {
    public static void main(String []args){

    }
}
