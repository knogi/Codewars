package net.der_floh.codewars.which_are_in;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by knogl on 24.10.2017.
 */
public class WhichAreInTest {

    private WhichAreIn whichAreIn;

    @Before
    public void setup() {
        whichAreIn = new WhichAreIn();
    }

    @Test
    public void inArrayTest1() {
        String[] array1 = new String[] { "arp", "live", "strong" };
        String[] array2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expected = new String[] { "arp", "live", "strong" };

        inArrayTestInternal(array1, array2, expected);
    }

    @Test
    public void inArrayTest2() {
        String[] array1 = new String[] { "tarp", "mice", "bull" };
        String[] array2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expected = new String[] {};

        inArrayTestInternal(array1, array2, expected);
    }

    private void inArrayTestInternal(String[] array1, String[] array2, String[] expected) {
        String[] result = whichAreIn.inArray(array1, array2);

        assertThat(result.length).isEqualTo(expected.length);

        for(int i = 0; i < expected.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }
}
