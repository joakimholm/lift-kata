package se.adaptiv.lift;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiftAcceptanceTest {

    @Test
    @Disabled
    void elevatorMovesAround() {
        Lift lift = new Lift(1, 4);
        assertEquals(DoorState.OPEN, lift.doorState());

        lift.request(3);
        assertEquals(3, lift.atFloor());
        // TODO Add checking series of actions
        assertEquals(DoorState.OPEN, lift.doorState());

        lift.call(2, Direction.UP);
        assertEquals(2, lift.atFloor());
        assertEquals(DoorState.OPEN, lift.doorState());

        lift.call(4, Direction.DOWN);
        assertEquals(4, lift.atFloor());
        assertEquals(DoorState.OPEN, lift.doorState());
    }
}
