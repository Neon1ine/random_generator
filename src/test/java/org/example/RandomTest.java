package org.example;
import org.junit.jupiter.api.Test;

class RandomTest {
    @Test
    void testRandom1() {
        var seq = new Random(100);
        var result1 = seq.getNext();
        var result2 = seq.getNext();

        if (!(result1 != result2)) {
            throw new AssertionError(result1 + " should NOT be equal to " + result2);
        }

        seq.reset();

        var result21 = seq.getNext();
        var result22 = seq.getNext();

        if (!(result1 == result21)) {
            throw new AssertionError(result1 + " should be equal to " + result21);
        }
        if (!(result2 == result22)) {
            throw new AssertionError(result2 + " should be equal to " + result22);
        }
    }

}
