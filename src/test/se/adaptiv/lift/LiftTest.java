package se.adaptiv.lift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiftTest {

    @Test
    void shouldStartAtLowestFloor() {
        Lift lift = new Lift(1, 3);
        assertEquals(1, lift.atFloor());
    }

    @Test
    void canMoveToAnotherFloor() {
        Lift lift = new Lift(1, 3);
        lift.move(2);
        assertEquals(2, lift.atFloor());
    }

}
