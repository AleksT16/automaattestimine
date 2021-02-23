import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KolmnurkTest {

    @Test
    public void pindalaTestKorrektne() {
        Kolmnurk kolmnurk = new Kolmnurk(1, 3, "FFFFFF");
        assertEquals(3.89711, kolmnurk.pindala(), 0.01);
    }

    @Test
    public void pindalaTestNull() {
        Kolmnurk kolmnurk = new Kolmnurk(1, 0, "FFFFFF");
        assertEquals(0, kolmnurk.pindala(), 0.00001);
    }

    @Test
    public void pindalaTestMiinus() {
        Kolmnurk kolmnurk = new Kolmnurk(1, -1, "FFFFFF");
        assertThrows(RuntimeException.class, () -> kolmnurk.pindala());
    }

    // Java ei luba kasutada String parameetrit, kui nõutud on integer.
    //    @Test
    //    public void pindalaTestMiinus() {
    //        Kolmnurk kolmnurk = new Kolmnurk(1, "kana", "FFFFFF");
    //        assertThrows(RuntimeException.class, () -> kolmnurk.pindala());
    //    }


    @Test
    public void ümbermõõtTestKorrektne() {
        Kolmnurk kolmnurk = new Kolmnurk(1, 3, "FFFFFF");
        assertEquals(9, kolmnurk.ümbermõõt(), 0.01);
    }

    @Test
    public void ümbermõõtTestNull() {
        Kolmnurk kolmnurk = new Kolmnurk(1, 0, "FFFFFF");
        assertEquals(0, kolmnurk.ümbermõõt(), 0.01);
    }

    @Test
    public void ümbermõõtTestMiinus() {
        Kolmnurk kolmnurk = new Kolmnurk(1, -1, "FFFFFF");
        assertThrows(RuntimeException.class, () -> kolmnurk.ümbermõõt());
    }



}
