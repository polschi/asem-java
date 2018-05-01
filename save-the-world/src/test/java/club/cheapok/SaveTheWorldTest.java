package club.cheapok;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaveTheWorldTest {
    @Test
    public void testDamage() {
        assertEquals(19,SaveTheWorld.calculateDamage("SCSCCSS"));
    }

    @Test
    public void testFeasibility() {
        assertFalse(SaveTheWorld.isFeasible(new StringBuilder("CSSSSS"),4));
        assertTrue(SaveTheWorld.isFeasible(new StringBuilder("CSSSSS"),5));
    }

}