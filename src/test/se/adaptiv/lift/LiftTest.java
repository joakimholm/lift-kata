package se.adaptiv.lift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiftTest {

    @Test
    void shouldStartAtLowestFloorWithOpenDoors() {
        Lift lift = new Lift(1, 3);
        assertEquals(1, lift.atFloor());
        assertEquals(DoorState.OPEN, lift.doorState());
    }

    @Test
    void shouldAcceptRequestsToMoveToAnotherFloor() {
        Lift lift = new Lift(1, 3);
        lift.request(2);
        assertEquals(2, lift.atFloor());
    }

}
