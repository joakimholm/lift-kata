package se.adaptiv.lift;

public class Lift {
    private int currentFloor;

    public Lift(int floorMin, int floorMax) {
        currentFloor = floorMin;
    }

    public void request(int newFloor) {
        currentFloor = newFloor;
    }

    public void call(int targetFloor, Direction direction) {
        currentFloor = targetFloor;
    }

    public int atFloor() {
        return currentFloor;
    }

    public DoorState doorState() {
        return DoorState.OPEN;
    }

}
