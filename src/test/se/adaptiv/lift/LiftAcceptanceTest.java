package se.adaptiv.lift;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiftAcceptanceTest {

    @Test
    @Disabled
    void handlesRequestsToGoToOtherFloors() {
        Lift lift = new Lift(1, 3);
        lift.request(2);
        assertEquals(2, lift.atFloor());
    }
}
