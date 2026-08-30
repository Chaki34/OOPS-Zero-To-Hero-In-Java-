package L_15_Association_Aggregation_Composition;
// ============================================================
// COMPOSITION
// Definition:
// Composition is a strong "HAS-A" relationship where the
// contained object depends on the container.
//
// Identification:
// If the parent is destroyed, child normally cannot exist
// independently in that design → Composition.
//
// Example: House HAS-A Room
// Rooms are created as part of the House.
// ============================================================

class House {

    private Room room;

    House() {
        // Room is created INSIDE House.
        // This shows strong ownership → Composition.
        room = new Room();
    }

    void showRoom() {
        room.display();
    }
}

class Room {

    void display() {
        System.out.println("This is a room inside the house.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

    }
}
