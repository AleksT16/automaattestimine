import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RingTest {

    @Test
    public void pindalaTestKorrektne() {
        Ring ring = new Ring(3, 3, "FFFFFF");
        assertEquals(28.274, ring.pindala(), 0.01);
    }

    @Test
    public void pindalaTestNull() {
        Ring ring = new Ring(0, 3, "FFFFFF");
        assertEquals(0, ring.pindala(), 0.00001);
    }

    @Test
    public void pindalaTestMiinus() {
        Ring ring = new Ring(-1, 3, "FFFFFF");
        assertThrows(RuntimeException.class, () -> ring.pindala());
    }

    // Java ei luba kasutada String parameetrit, kui nõutud on integer.
    //    @Test
    //    public void pindalaTestMiinus() {
    //        Ring ring = new Ring(1, "kana", "FFFFFF");
    //        assertThrows(RuntimeException.class, () -> ring.pindala());
    //    }


    @Test
    public void ümbermõõtTestKorrektne() {
        Ring ring = new Ring(3, 3, "FFFFFF");
        assertEquals(18.849, ring.ümbermõõt(), 0.01);
    }

    @Test
    public void ümbermõõtTestNull() {
        Ring ring = new Ring(0, 3, "FFFFFF");
        assertEquals(0, ring.ümbermõõt(), 0.01);
    }

    @Test
    public void ümbermõõtTestMiinus() {
        Ring ring = new Ring(-1, 3, "FFFFFF");
        assertThrows(RuntimeException.class, () -> ring.ümbermõõt());
    }



}
