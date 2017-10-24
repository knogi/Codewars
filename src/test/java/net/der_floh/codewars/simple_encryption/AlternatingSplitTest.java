package net.der_floh.codewars.simple_encryption;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;

public class AlternatingSplitTest {

    private AlternatingSplit alternatingSplit;

    @Before
    public void setup() {
        alternatingSplit = new AlternatingSplit();
    }

    // TESTS

    // encrypt

    @Test
    public void encryptTestNull() {
        assertThat(alternatingSplit.encrypt(null, anyInt())).isNull();
    }

    @Test
    public void encryptTestEmpty() {
        assertThat(alternatingSplit.encrypt("", anyInt())).isEqualTo("");
    }

    @Test
    public void encryptTestInvalidRepeatNum() {
        String sample = "some text";
        assertThat(alternatingSplit.encrypt(sample, 0)).isEqualTo(sample);
        assertThat(alternatingSplit.encrypt(sample, -1)).isEqualTo(sample);
    }

    @Test
    public void encryptTest1() {
        final String sample = "This is a test!";
        final String expected = "hsi  etTi sats!";
        final int n = 1;
        encryptTest(sample, n, expected);
    }

    @Test
    public void encryptTest2() {
        String sample = "This is a test!";
        String expected = "s eT ashi tist!";
        final int n = 2;
        encryptTest(sample, n, expected);
    }

    private void encryptTest(final String sample, final int n, final String expected) {
        assertThat(alternatingSplit.encrypt(sample, n)).isEqualTo(expected);
    }

    // decrypt
    
    @Test
    public void decryptTestNull() {
        assertThat(alternatingSplit.decrypt(null, anyInt())).isNull();
    }

    @Test
    public void decryptTestEmpty() {
        assertThat(alternatingSplit.decrypt("", anyInt())).isEqualTo("");
    }

    @Test
    public void decryptTestInvalidRepeatNum() {
        String sample = "some text";
        assertThat(alternatingSplit.decrypt(sample, 0)).isEqualTo(sample);
        assertThat(alternatingSplit.decrypt(sample, -1)).isEqualTo(sample);
    }

    @Test
    public void decryptTest1() {
        final String sample = "hsi  etTi sats!";
        final String expected = "This is a test!";
        final int n = 1;
        decryptTest(sample, n, expected);
    }

    @Test
    public void decryptTest2() {
        String sample = "s eT ashi tist!";
        String expected = "This is a test!";
        final int n = 2;
        decryptTest(sample, n, expected);
    }

    private void decryptTest(final String sample, final int n, final String expected) {
        assertThat(alternatingSplit.decrypt(sample, n)).isEqualTo(expected);
    }
}
