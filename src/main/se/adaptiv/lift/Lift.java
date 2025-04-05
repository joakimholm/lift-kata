package se.adaptiv.lift;

public class Lift {
    private int currentFloor;

    public Lift(int floorMin, int floorMax) {
        currentFloor = floorMin;
    }

    public void request(int targetFloor) {
        
    }

    public int atFloor() {
        return currentFloor;
    }

    public void move(int newFloor) {
        currentFloor = newFloor;
    }
}
