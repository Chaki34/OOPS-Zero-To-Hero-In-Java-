package L_15_Association_Aggregation_Composition;

// ============================================================
// AGGREGATION
// Definition:
// Aggregation is a "HAS-A" relationship where the contained
// object can exist independently of the container.
//
// Identification:
// If the parent is destroyed, child can still exist → Aggregation.
//
// Example: Department HAS-A Teacher
// A Teacher can exist even if Department is removed.
// ============================================================

class Department {

    Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Department dep = new Department(teacher);


    }
}
